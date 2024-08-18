

    public class directory {
        private person[] personlist = new person[10];
        int count = 0;

        public directory() {
        }

        public void insert(person p) {
            if (this.count <= 10) {
                this.personlist[this.count] = p;
                System.out.println("insert successfully");
                ++this.count;
            }

            System.out.println("space is already filled");
        }

        public String search(String name) {
            int i = 0;
            if (i < this.count) {
                if (this.personlist[i].getname().equalsIgnoreCase(name)) {
                }

                System.out.println("FOUNDED");
                return "";
            } else {
                System.out.println("NOT FOUNDED");
                return null;
            }
        }

        public void update(String name, int phone) {
            for(int i = 0; i < this.count; ++i) {
                if (this.personlist[i].getname().equalsIgnoreCase(name)) {
                    this.personlist[i].setphone(phone);
                    System.out.println("SUCCESSFULLY UPDATED");
                    return;
                }

                System.out.println("NOT FOUNDED");
            }

        }

        public void delete(String name) {
            int i = 0;
            if (i < this.count) {
                if (this.personlist[i].getname().equalsIgnoreCase(name)) {
                }

                this.personlist[i].setphone(0);
                this.personlist[i].setname("");
                System.out.println("SUUCESSFULLY DELETED");
            } else {
                System.out.println("NOT FOUNDED");
            }
        }

        public void printlist(String name) {
            for(int i = 0; i < this.count; ++i) {
                if (!this.personlist[i].getname().isEmpty()) {
                    person var10001 = this.personlist[i];
                    System.out.println("NAME IS =" + var10001.getname());
                    var10001 = this.personlist[i];
                    System.out.println("phone no =" + var10001.getphone());
                }
            }

        }
    }

