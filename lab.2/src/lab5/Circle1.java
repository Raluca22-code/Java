package lab5;


    public class Circle1 extends Shape1 {

        protected double radius = 1.0;
        private String color = "red";

        Circle1() {
            super();
        }

        Circle1(double radius) {
            super();
            this.radius = radius;
        }

        Circle1(double a, String b) {
            super();
            radius = a;
            color = b;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return radius * radius * Math.PI;
        }

        @Override
        public double getPerimeter() {
            return 2 * radius * Math.PI;
        }

        @Override
        public String toString() {
            return " A circle with radius " + radius;
        }
    }
