/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W02_tugas;

/**
 *
 * @author ACER
 */
public class Tugas_managingpeople {
    public static void main(String[] args) {
        Tugas_managingpeople_person p1 = new Tugas_managingpeople_person ("Arial", 37);
        Tugas_managingpeople_person p2 = new Tugas_managingpeople_person ("Joseph", 15);

        if (p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }
    }
}
