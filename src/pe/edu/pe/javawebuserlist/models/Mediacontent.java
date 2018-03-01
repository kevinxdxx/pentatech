package pe.edu.pe.javawebuserlist.models;

public class Mediacontent {
        private int id;
        private String name;
        private String url;

        public Mediacontent(int id, String name, String url) {
            this.id = id;
            this.name = name;
            this.url = url;
        }

    public Mediacontent() {
    }

    public int getId() {
            return id;
        }

        public Mediacontent setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public Mediacontent setName(String name) {
            this.name = name;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Mediacontent setUrl(String url) {
            this.url = url;
            return this;
        }
    }

