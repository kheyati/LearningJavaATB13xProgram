package ex_32_Collection_Framework_DSA.LIST;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab250_AL_Interview {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(94);
        marks.add(90);
        marks.add(97);
        marks.add(88);

        System.out.println(marks);

        System.out.println("________");

        Collections.sort(marks);
        System.out.println(marks);

        System.out.println("________");
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);

    }
}
