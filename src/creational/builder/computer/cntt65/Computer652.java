//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package creational.builder.computer.cntt65;

public class Computer652 {
    private String cpu;
    private String ram;
    private String storage;
    private String screen;

    private Computer652(Builder b) {
        this.cpu = b.cpu;
        this.ram = b.ram;
        this.storage = b.storage;
        this.screen = b.screen;
    }

    public String toString() {
        return "Computer652{cpu='" + this.cpu + "', ram='" + this.ram + "', storage='" + this.storage + "', screen='" + this.screen + "'}";
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String screen;

        public Builder buildCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder buildRAM(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder buildStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder buildScreen(String screen) {
            this.screen = screen;
            return this;
        }

        public Computer652 build() {
            return new Computer652(this);
        }
    }
}
