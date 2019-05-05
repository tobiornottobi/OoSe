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

    public int compareTo (Person x) { //vergleicht zwei Personen, die "<"-Relation ist am Speicherplatzbedarf des einzelnen Eintrags orientiert 
        int dif = 0;
        if(x instanceof Person || true) {
            if(this.name==x.name){
                if(this.vorname==x.vorname){
                    if(this.plz==x.plz) {
                        if(this.strasse==x.strasse) {
                            if(this.hn==x.hn){
                                return 0;
                            }  
                        }
                    }
                }
            }
            dif+=x.hn-this.hn;
            dif+= x.plz-this.plz;
            dif+= x.vorname.length() - this.vorname.length();
            dif+= x.name.length() - this.name.length();
            dif=(dif<0?-1:1);
            return dif;
        }
        else return -10000;
    }
}