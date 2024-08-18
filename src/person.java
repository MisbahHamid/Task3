public class person {

        String name;
        int phone;

        public person() {
        }

        public void person() {
            this.name = "";
            this.phone = 0;
        }

        public void person(int newphone, String newname) {
            this.name = newname;
            this.phone = newphone;
        }

        public void setname(String newname) {
            this.name = newname;
        }

        public String getname() {
            return this.name;
        }

        public void setphone(int newphone) {
            this.phone = newphone;
        }

        public int getphone() {
            return this.phone;
        }
    }


