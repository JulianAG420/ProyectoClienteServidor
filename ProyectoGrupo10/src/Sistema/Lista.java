package Sistema;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;


public class Lista {

    

    private Node<Planilla> headA;
    private Node<Planilla> tailA;

    public void insertar(Planilla value) {

        Node<Planilla> nuevoNodo = new Node<Planilla>(value);

        if (headA == null) {
            headA = nuevoNodo;
            tailA = headA;
            tailA.setNext(headA);
            headA.setBack(tailA);//

        } else {
            nuevoNodo.setBack(tailA);//
            tailA.setNext(nuevoNodo);
            tailA = nuevoNodo;
            tailA.setNext(headA);
            headA.setBack(tailA);//

        }

    }

    public void printList() {

        Node<Planilla> aux = headA;
        System.out.println("\n" + "~".repeat(30));
        if (headA == null) {
            System.out.println("No hay nada en la lista.");
            System.out.println("~".repeat(30));
        } else {
            System.out.println("Esta es la lista.");
            while (aux != tailA) {
                System.out.println(aux.getValue().toString());
                aux = aux.getNext();
            }
            System.out.println(tailA.getValue().toString());
            System.out.println("~".repeat(30));
        }
    }

    public Vector<Vector<Object>> vectorLista() {

        Node<Planilla> planilla = headA;

        Vector<Vector<Object>> data = new Vector<>();

        while (planilla != headA.getBack()) {

            Vector<Object> vector = new Vector<>();

            vector.add(planilla.getValue().getId());
            vector.add(planilla.getValue().getCedula());
            vector.add(planilla.getValue().getNombre());
            vector.add(planilla.getValue().getSalarioXhoras());
            vector.add(planilla.getValue().getMes());
            vector.add(planilla.getValue().getAnio());
            vector.add(planilla.getValue().getHoras());
            vector.add(planilla.getValue().getTotal());
            data.add(vector);

            planilla = planilla.getNext();
        }

        Vector<Object> vector = new Vector<>();

        vector.add(planilla.getValue().getId());
        vector.add(planilla.getValue().getCedula());
        vector.add(planilla.getValue().getNombre());
        vector.add(planilla.getValue().getSalarioXhoras());
        vector.add(planilla.getValue().getMes());
        vector.add(planilla.getValue().getAnio());
        vector.add(planilla.getValue().getHoras());
        vector.add(planilla.getValue().getTotal());
        data.add(vector);
        data.add(vector);

        return data;
    }

}
