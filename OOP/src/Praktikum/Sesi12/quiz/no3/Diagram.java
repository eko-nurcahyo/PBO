package Praktikum.Sesi12.quiz.no3;

public class Diagram {
    
    // Define Phone interface
    interface Phone {
        int MAX_VOLUME = 10;
        int MIN_VOLUME = 0;
    
        void powerOn();
        void powerOff();
        void volumeUp();
        void volumeDown();
        int getVolume();
        boolean isPowerOn();
        String getBrand(); // Method to get phone brand
    }
    
    // Define PhoneUser class
    static class PhoneUser {
        private Phone phone;
    
        public PhoneUser(Phone phone) {
            this.phone = phone;
        }
    
        public void turnOnThePhone() {
            phone.powerOn();
            System.out.println("Ponsel " + phone.getBrand() + " dihidupkan.");
        }
    
        public void turnOffThePhone() {
            phone.powerOff();
            System.out.println("Ponsel " + phone.getBrand() + " dimatikan.");
        }
    
        public void makePhoneLouder() {
            phone.volumeUp();
            System.out.println("Volume dinaikkan.");
        }
    
        public void makePhoneSilent() {
            phone.volumeDown();
            System.out.println("Volume diturunkan.");
        }
    
        public void showPhoneStatus() {
            System.out.println("Status ponsel " + phone.getBrand() + ": " + (phone.isPowerOn() ? "Menyalakan" : "Mati"));
            System.out.println("Volume saat ini: " + phone.getVolume());
        }
    }
    
    // Xiaomi class implementing Phone interface
    static class Xiaomi implements Phone {
        private int volume = 5;  // Default volume
        private boolean isPowerOn = false;
    
        @Override
        public void powerOn() {
            isPowerOn = true;
        }
    
        @Override
        public void powerOff() {
            isPowerOn = false;
        }
    
        @Override
        public void volumeUp() {
            if (isPowerOn && volume < MAX_VOLUME) {
                volume++;
            }
        }
    
        @Override
        public void volumeDown() {
            if (isPowerOn && volume > MIN_VOLUME) {
                volume--;
            }
        }
    
        @Override
        public int getVolume() {
            return volume;
        }
    
        @Override
        public boolean isPowerOn() {
            return isPowerOn;
        }
    
        @Override
        public String getBrand() {
            return "Xiaomi";
        }
    }
    
    // iPhone class implementing Phone interface
    static class IPhone implements Phone {
        private int volume = 5;  // Default volume
        private boolean isPowerOn = false;
    
        @Override
        public void powerOn() {
            isPowerOn = true;
        }
    
        @Override
        public void powerOff() {
            isPowerOn = false;
        }
    
        @Override
        public void volumeUp() {
            if (isPowerOn && volume < MAX_VOLUME) {
                volume++;
            }
        }
    
        @Override
        public void volumeDown() {
            if (isPowerOn && volume > MIN_VOLUME) {
                volume--;
            }
        }
    
        @Override
        public int getVolume() {
            return volume;
        }
    
        @Override
        public boolean isPowerOn() {
            return isPowerOn;
        }
    
        @Override
        public String getBrand() {
            return "iPhone";
        }
    }
    
    // Main class to test functionality
    public static class Main {
        public static void main(String[] args) {
            PhoneUser user = new PhoneUser(new Xiaomi());
            user.turnOnThePhone();
            user.makePhoneLouder();
            user.showPhoneStatus();
            
            PhoneUser user2 = new PhoneUser(new IPhone());
            user2.turnOnThePhone();
            user2.makePhoneSilent();
            user2.showPhoneStatus();
        }
    }
}
