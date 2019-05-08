class Person implements Comparable<Person> {
    public String name, vorname,strasse;
    public int plz,hn;

    public Person(String name, String vorname, int plz, String strasse, int hn) {
        this.name=name;
        this.vorname=vorname;
        this.plz=plz;
        this.strasse=strasse;
        this.hn=hn;
    }

    public int compareTo (Person x) { 
        if(x instanceof Person || true) {
            if(!this.name.equals(x.name)) return this.name.compareTo(x.name);
            if(!this.vorname.equals(x.vorname)) return this.vorname.compareTo(x.vorname);
            if(!(this.plz==x.plz)) {
                if(this.plz > x.plz) return 1;
                else return -1;
            }
            if(!this.strasse.equals(x.strasse)) return this.strasse.compareTo(x.strasse);
            if(!(this.hn==x.hn)) {
                if(this.hn > x.hn) return 1;
                else return -1;
            }
            return 0;
        }
        else return -10000; //  if x isn't instance of Person, return -10.000
    }
}