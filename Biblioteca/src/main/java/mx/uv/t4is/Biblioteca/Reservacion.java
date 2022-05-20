package mx.uv.t4is.Biblioteca;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservacion {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
    
        private String nombre;
    
        private String concepto;
    
        private String fecha;
    
        private String horaInicio;
    
        private String horaFin;
        
        private String tiempo;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getConcepto() {
            return concepto;
        }

        public void setConcepto(String concepto) {
            this.concepto = concepto;
        }

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

        public String getHoraInicio() {
            return horaInicio;
        }

        public void setHoraInicio(String horaInicio) {
            this.horaInicio = horaInicio;
        }

        public String getHoraFin() {
            return horaFin;
        }

        public void setHoraFin(String horaFin) {
            this.horaFin = horaFin;
        }

        public String getTiempo() {
            return tiempo;
        }

        public void setTiempo(String tiempo) {
            this.tiempo = tiempo;
        }

        
}
