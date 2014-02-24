package model;

public class Patient {
  
 private int patientnr;
 private String patientnaam;
 private String patienttel;
 
 public Patient(){
  
 }
 
 public Patient(int patientnr, String patientnaam, String patienttel){
  this.patientnr = patientnr;
  this.patientnaam = patientnaam;
  this.patienttel = patienttel;
 }
 
 public int getPatientnr(){
  return patientnr;
 }
 
 public String getPatientnaam(){
  return patientnaam;
  
 }
 
 public String getPatienttel(){
  return patienttel;
 }

 
 public void setPatientnr(int patientnummer) {
  this.patientnr = patientnr;
 }

 public void setPatientnaam(String patientnaam) {
  this.patientnaam = patientnaam;
 }

 public void setPatienttel(String patienttel) {
  this.patienttel = patienttel;
 }

 @Override
 public boolean equals(Object object) {
  if(object instanceof Patient){
   Patient patient = (Patient) object;
   if(patient.patientnr == this.patientnr){
    return true;
   }
  }
  return false;

 }

 @Override
 public int hashCode() {
  return 37 * patientnr;
 }

 @Override
 public String toString() {
  return "De patient heet " + patientnaam + "met tel: " + patienttel + " en zijn/haar patientnr is " + patientnr;
 }
 
}