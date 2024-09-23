package org.example;

public class Motorka extends Vozidlo{
        public String typmotoru;

        public Motorka(String spz, String vyrobce, String model, int rokVyroby, String typmotoru) {
            super(spz, vyrobce, model, rokVyroby);
            this.typmotoru = typmotoru;
        }

        public String getTypMotoru() {
            return typmotoru;
        }

        public void setTypMotoru(String typmotoru) {
            this.typmotoru = typmotoru;
        }

        @Override
        public String toString() {
            return "Motorka:" +super.toString() +
                    "typ motoru=" + typmotoru +
                    '}';
        }
}
