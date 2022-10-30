package paquete;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    int id;
    ArrayList<Nodo> marked;
    Graphics g;
    ArrayList<Nodo> nodos;
    ArrayList<Lado> lados;
    int mat[][];
    boolean usingMatrix = false;
    static ArrayList<Long> tiemposMejorados = new ArrayList<Long>();
    static ArrayList<String> funcionoMejorado = new ArrayList<String>();
    static ArrayList<Long> tiemposAntiguos = new ArrayList<Long>();
    static ArrayList<String> funcionoAntiguo = new ArrayList<String>();

    public Principal() {
        initComponents();
        id = 0;
        g = getGraphics();
        nodos = new ArrayList();
        marked = new ArrayList();
        lados = new ArrayList();
        this.setResizable(false);
        this.setSize(965, 550);
        this.setLocationRelativeTo(null);
        textArea1.append("Dibuje sobre el tablero o abra el archivo\n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea1 = new java.awt.TextArea();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mAdyacencia = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textArea1.setEditable(false);
        getContentPane().add(textArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 460, 120));

        jButton8.setText("Partición Perfecta mejorada");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 200, 50));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 470, 340));

        mAdyacencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(mAdyacencia);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 430, 290));

        jPanel2.setBackground(new java.awt.Color(38, 70, 83));

        jButton10.setText("Borrar");
        jButton10.setToolTipText("");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton1.setText("Abrir archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Matriz de adyacencia");

        jButton2.setText("Prueba para grafo n-completo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton11.setText("Partición Perfecta NO mejorada");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(490, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(324, 324, 324)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void DibujarLineas(int nodo1, int nodo2) {
        g.setColor(Color.BLUE);
        g.drawLine(lados.get(nodo1).getNodo1().getPosx0(), lados.get(nodo1).getNodo1().getPosy0(), lados.get(nodo2).getNodo1().getPosx0(), lados.get(nodo2).getNodo1().getPosy0());
    }

    private int[][] MatrizAdyacencia() {

        int MatrizAd[][] = new int[nodos.size()][nodos.size()];
        for (int i = 0; i < nodos.size(); i++) {
            for (int j = 0; j < nodos.size(); j++) {
                MatrizAd[i][j] = 0;
            }
        }

        for (int i = 0; i < lados.size(); i++) {
            MatrizAd[lados.get(i).getNodo1().getId()][lados.get(i).getNodo2().getId()] = 1;
            MatrizAd[lados.get(i).getNodo2().getId()][lados.get(i).getNodo1().getId()] = 1;
        }
        return MatrizAd;

    }

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void UnirNodos() {
        if (marked.size() > 1 && marked.get(0) != marked.get(1)) {
            Lado l = new Lado(marked.get(0), marked.get(1));
            int val1 = marked.get(0).getValencia();
            int val2 = marked.get(1).getValencia();
            marked.get(0).setValencia(val1 + 1);
            marked.get(1).setValencia(val2 + 1);
            lados.add(l);
            g.setColor(Color.BLUE);
            g.drawOval(marked.get(0).getPosx1(), marked.get(0).getPosy1(), 30, 30);
            g.drawOval(marked.get(1).getPosx1(), marked.get(1).getPosy1(), 30, 30);
            g.setColor(Color.BLACK);
            g.drawLine(marked.get(0).getPosx0(), marked.get(0).getPosy0(), marked.get(1).getPosx0(), marked.get(1).getPosy0());
            System.out.println("Se ha creado un lado uniendo los nodos: " + l.getNodo1().getId() + " con: " + l.getNodo2().getId());
            marked.get(0).CambiaMarcador();
            marked.get(1).CambiaMarcador();
            marked.clear();
        }
        drawMatriz();
    }

    private void ReiniciarGrafo() {
        for (int i = 0; i < lados.size(); i++) {
            g.setColor(Color.BLACK);
            g.drawLine(lados.get(i).getNodo1().getPosx0(), lados.get(i).getNodo1().getPosy0(), lados.get(i).getNodo2().getPosx0(), lados.get(i).getNodo2().getPosy0());
        }
    }

    static void getCofactor(int mat[][], int temp[][],
            int p, int q, int n) {
        int i = 0, j = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row != p && col != q) {
                    temp[i][j++] = mat[row][col];
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    static int determinantOfMatrix(int mat[][], int n) {
        int D = 0;

        if (n == 1) {
            return mat[0][0];
        }

        int temp[][] = new int[n][n];

        int sign = 1;

        for (int f = 0; f < n; f++) {
            // Getting Cofactor of mat[0][f]
            getCofactor(mat, temp, 0, f, n);
            D += sign * mat[0][f]
                    * determinantOfMatrix(temp, n - 1);

            sign = -sign;
        }

        return D;
    }

    public int detmejorado(int matriz[][]) {
        int fRet = 0;
        int product = 0;
        if (matriz.length == 2) {
            fRet = matriz[0][0] * matriz[1][1] - matriz[1][0] * matriz[0][1];
        } else {
            for (int i = 0; i < matriz.length; i++) {
                product = 1;
                for (int j = 0; j < matriz.length; j++) {
                    product *= matriz[(i + j) % matriz.length][j];
                }
                fRet += product;
                product = 1;
                for (int j = 0; j < matriz.length; j++) {
                    product *= matriz[(matriz.length - 1) - ((i + j) % matriz.length)][j];
                }
                fRet -= product;
            }
        }
        return fRet;
    }

    public void particionPerfectAantiguo() {
        long in = System.nanoTime();
        textArea1.append("PARTICIÓN PERFECTA DE EMPAREJAMIENTO");
        textArea1.append(System.getProperty("line.separator"));
        ReiniciarGrafo();
        int a[][] = MatrizAdyacencia();
        int b[][] = new int[nodos.size()][nodos.size()];
        for (int i = 0; i < nodos.size(); i++) {
            for (int j = 0; j < nodos.size(); j++) {
                if (i < j) {
                    b[i][j] = a[i][j];
                } else {
                    if (i > j) {
                        b[i][j] = -1 * a[j][i];
                    } else {
                        b[i][j] = 0;
                    }
                }
            }
        }
        System.out.println("MATRIZ DE TUTTE:");
        for (int x = 0; x < b.length; x++) {
            System.out.print("|");
            for (int y = 0; y < b[x].length; y++) {
                System.out.print(b[x][y]);
                if (y != b[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
        int valor = determinantOfMatrix(b, b.length);
        System.out.println("Determinante es: " + valor);
        textArea1.append("Determinante de la matriz de Tutte: " + valor);
        textArea1.append(System.getProperty("line.separator"));
        if (valor == 0) {
            textArea1.append("No existe un emparejamiento perfecto en el grafo.");
            textArea1.append(System.getProperty("line.separator"));
            funcionoAntiguo.add("No");
        } else {
            funcionoAntiguo.add("Si");
            ArrayList<Lado> matching = new ArrayList<Lado>();
            textArea1.append("Existe un emparejamiento perfecto en el grafo. Se procede a mostrar uno.");
            textArea1.append(System.getProperty("line.separator"));
            //Como existe un perfect matching, se procede a buscar uno.
            int valor1 = 0; //Estos serán los valores de grado de los nodos.
            int valor2 = 0;
            for (int i = 0; i < lados.size(); i++) {
                valor1 = lados.get(i).getNodo1().getValencia();
                valor2 = lados.get(i).getNodo2().getValencia();
                lados.get(i).setVallado(valor1 + valor2);
            }
            Lado buscado = MenorLado(lados);
            matching.add(buscado);
            ArrayList<Lado> copialados = new ArrayList();
            for (int i = 0; i < lados.size(); i++) {
                copialados.add(lados.get(i));
            }
            for (int j = 0; j < lados.size(); j++) {
                if (lados.get(j).getNodo1() == buscado.getNodo1() || lados.get(j).getNodo2() == buscado.getNodo2() || lados.get(j).getNodo1() == buscado.getNodo2() || lados.get(j).getNodo2() == buscado.getNodo1()) {
                    System.out.println("Se ha debido quitar el lado que une a los nodos:  " + lados.get(j).getNodo1().getId() + "," + lados.get(j).getNodo2().getId());
                    copialados.remove(lados.get(j));
                }
            }
            copialados.remove(buscado);
            while (copialados.isEmpty() == false) {
                buscado = MenorLado(copialados);
                matching.add(buscado);
                for (int j = 0; j < lados.size(); j++) {
                    if (lados.get(j).getNodo1() == buscado.getNodo1() || lados.get(j).getNodo2() == buscado.getNodo2() || lados.get(j).getNodo1() == buscado.getNodo2() || lados.get(j).getNodo2() == buscado.getNodo1()) {
                        copialados.remove(lados.get(j));
                        System.out.println("Se ha debido quitar el lado: " + lados.get(j).getPeso());
                    }
                }
                copialados.remove(buscado);
            }
            jPanel1.getGraphics().clearRect(1, 1, jPanel1.getWidth() - 2, jPanel1.getHeight() - 2);
            for (int i = 0; i < nodos.size(); i++) {
                g.setColor(Color.RED);
                nodos.get(i).DibujarVertice(g);
            }
            for (int i = 0; i < matching.size(); i++) {
                g.setColor(Color.BLUE);
                g.drawLine(matching.get(i).getNodo1().getPosx0(), matching.get(i).getNodo1().getPosy0(), matching.get(i).getNodo2().getPosx0(), matching.get(i).getNodo2().getPosy0());
                textArea1.append("Lado dibujado que une a los nodos: " + matching.get(i).getNodo1().getId() + "," + matching.get(i).getNodo2().getId());
                textArea1.append(System.getProperty("line.separator")); // Esto para el salto de línea
            }
        }
        drawMatriz();
        long total = System.nanoTime() - in;
        tiemposAntiguos.add(total);
    }

    public void particionPerfectaMejorada() {
        long in = System.nanoTime();
        textArea1.append("PARTICIÓN PERFECTA DE EMPAREJAMIENTO");
        textArea1.append(System.getProperty("line.separator"));
        ReiniciarGrafo();
        int a[][] = MatrizAdyacencia();
        int b[][] = new int[nodos.size()][nodos.size()];
        for (int i = 0; i < nodos.size(); i++) {
            for (int j = 0; j < nodos.size(); j++) {
                if (i < j) {
                    b[i][j] = a[i][j];
                } else {
                    if (i > j) {
                        b[i][j] = -1 * a[j][i];
                    } else {
                        b[i][j] = 0;
                    }
                }
            }
        }
        System.out.println("MATRIZ DE TUTTE:");
        for (int x = 0; x < b.length; x++) {
            System.out.print("|");
            for (int y = 0; y < b[x].length; y++) {
                System.out.print(b[x][y]);
                if (y != b[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
        int valor = detmejorado(b);
        System.out.println("Determinante es: " + valor);
        textArea1.append("Determinante de la matriz de Tutte: " + valor);
        textArea1.append(System.getProperty("line.separator"));
        if (valor == 0) {
            textArea1.append("No existe un emparejamiento perfecto en el grafo.");
            textArea1.append(System.getProperty("line.separator"));
            funcionoMejorado.add("No");
        } else {
            funcionoMejorado.add("Si");
            ArrayList<Lado> matching = new ArrayList<Lado>();
            textArea1.append("Existe un emparejamiento perfecto en el grafo. Se procede a mostrar uno.");
            textArea1.append(System.getProperty("line.separator"));
            //Como existe un perfect matching, se procede a buscar uno.
            int valor1 = 0; //Estos serán los valores de grado de los nodos.
            int valor2 = 0;
            for (int i = 0; i < lados.size(); i++) {
                valor1 = lados.get(i).getNodo1().getValencia();
                valor2 = lados.get(i).getNodo2().getValencia();
                lados.get(i).setVallado(valor1 + valor2);
            }
            Lado buscado = MenorLado(lados);
            matching.add(buscado);
            ArrayList<Lado> copialados = new ArrayList();
            for (int i = 0; i < lados.size(); i++) {
                copialados.add(lados.get(i));
            }
            for (int j = 0; j < lados.size(); j++) {
                if (lados.get(j).getNodo1() == buscado.getNodo1() || lados.get(j).getNodo2() == buscado.getNodo2() || lados.get(j).getNodo1() == buscado.getNodo2() || lados.get(j).getNodo2() == buscado.getNodo1()) {
                    System.out.println("Se ha debido quitar el lado que une a los nodos:  " + lados.get(j).getNodo1().getId() + "," + lados.get(j).getNodo2().getId());
                    copialados.remove(lados.get(j));
                }
            }
            copialados.remove(buscado);
            while (copialados.isEmpty() == false) {
                buscado = MenorLado(copialados);
                matching.add(buscado);
                for (int j = 0; j < lados.size(); j++) {
                    if (lados.get(j).getNodo1() == buscado.getNodo1() || lados.get(j).getNodo2() == buscado.getNodo2() || lados.get(j).getNodo1() == buscado.getNodo2() || lados.get(j).getNodo2() == buscado.getNodo1()) {
                        copialados.remove(lados.get(j));
                        System.out.println("Se ha debido quitar el lado: " + lados.get(j).getPeso());
                    }
                }
                copialados.remove(buscado);
            }
            jPanel1.getGraphics().clearRect(1, 1, jPanel1.getWidth() - 2, jPanel1.getHeight() - 2);
            for (int i = 0; i < nodos.size(); i++) {
                g.setColor(Color.RED);
                nodos.get(i).DibujarVertice(g);
            }
            for (int i = 0; i < matching.size(); i++) {
                g.setColor(Color.BLUE);
                g.drawLine(matching.get(i).getNodo1().getPosx0(), matching.get(i).getNodo1().getPosy0(), matching.get(i).getNodo2().getPosx0(), matching.get(i).getNodo2().getPosy0());
                textArea1.append("Lado dibujado que une a los nodos: " + matching.get(i).getNodo1().getId() + "," + matching.get(i).getNodo2().getId());
                textArea1.append(System.getProperty("line.separator")); // Esto para el salto de línea
            }
        }
        drawMatriz();
        long total = System.nanoTime() - in;
        tiemposMejorados.add(total);
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        particionPerfectaMejorada();
    }//GEN-LAST:event_jButton8ActionPerformed

    private Lado MenorLado(ArrayList<Lado> arreglo) {
        int menor = 9999;
        Lado lmenor = null;
        for (int i = 0; i < arreglo.size(); i++) {
            if (arreglo.get(i).getVallado() < menor) {
                menor = arreglo.get(i).getVallado();
                lmenor = arreglo.get(i);
            }
        }
        return lmenor;
    }

    public static void writeFile(String titulo) {
        try {
            FileWriter myWriter = new FileWriter("src/paquete/" + titulo + ".csv");
            myWriter.write("No Experimento,n,Funciono,tiempos\n");
            for (int i = 1; i <= tiemposMejorados.size(); i++) {
                myWriter.write(i + "," + (i + 1) + "," + funcionoMejorado.get(i - 1) + "," + tiemposMejorados.get(i - 1) + "\n");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeFile2(String titulo) {
        try {
            FileWriter myWriter = new FileWriter("src/paquete/" + titulo + ".csv");
            myWriter.write("No Experimento,n,Funciono,tiempos\n");
            for (int i = 1; i <= tiemposAntiguos.size(); i++) {
                myWriter.write(i + "," + (i + 1) + "," + funcionoAntiguo.get(i - 1) + "," + tiemposAntiguos.get(i - 1) + "\n");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //Dibujar los nodos
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        //Obtenemos la posición del click para realizar la creación de nodos.
        Point p = MouseInfo.getPointerInfo().getLocation();
        p.x -= this.getLocation().x;
        p.y -= this.getLocation().y;
        if (!nodos.isEmpty()) {
            int sw = 0;
            for (int i = 0; i < nodos.size(); i++) {
                if (p.x > nodos.get(i).getPosx1() && p.x < nodos.get(i).getPosx2() //Si la posición del click se encuentra en algún nodo.
                        && p.y > nodos.get(i).getPosy1() && p.y < nodos.get(i).getPosy2()) {
                    nodos.get(i).CambiaMarcador();
                    if (nodos.get(i).isIsMarked() == true) {
                        marked.add(nodos.get(i));
                        g.setColor(Color.RED);
                        g.drawOval(nodos.get(i).getPosx1(), nodos.get(i).getPosy1(), 30, 30);
                    } else {
                        marked.remove(nodos.get(i));
                        g.setColor(Color.RED);
                        g.drawOval(nodos.get(i).getPosx1(), nodos.get(i).getPosy1(), 30, 30);
                    }
                    sw = 1;
                    System.out.println("Se ha marcado el nodo: " + nodos.get(i).getId() + " a estado: " + nodos.get(i).isIsMarked());
                }
            }
            if (sw != 1) {
                int posx1 = (p.x) - 15; //Posiciones de lado X anterior al centro.
                int posy1 = (p.y) - 15; //Posiciones de lado Y anterior al centro.
                Nodo n = new Nodo(id, p.x, p.y, posx1, posy1, posx1 + 30, posy1 + 30, false); //Se crea un nuevo nodo.
                nodos.add(n);
                n.DibujarVertice(g);
                System.out.println("Nodo: " + n.getId() + " con centro posx: " + n.getPosx0() + " posy: " + n.getPosy0());
                id++;
            }
        } else {
            int posx1 = (p.x) - 15; //Posiciones de lado X anterior al centro.
            int posy1 = (p.y) - 15; //Posiciones de lado Y anterior al centro.
            Nodo n = new Nodo(id, p.x, p.y, posx1, posy1, posx1 + 30, posy1 + 30, false); //Se crea un nuevo nodo.
            nodos.add(n);
            n.DibujarVertice(g);
            System.out.println("Nodo: " + n.getId() + " con centro posx: " + n.getPosx0() + " posy: " + n.getPosy0());
            id++;
        }

        drawMatriz();
        UnirNodos();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void drawMatriz() {
        int MatrizAd[][] = new int[nodos.size()][nodos.size()];

        DefaultTableModel model = (DefaultTableModel) mAdyacencia.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
        for (int i = 0; i < nodos.size(); i++) {
            model.addColumn(i);
            model.addRow(new Object[]{});
        }

        for (int i = 0; i < nodos.size(); i++) {
            for (int j = 0; j < nodos.size(); j++) {
                MatrizAd[i][j] = 0;
            }
        }

        for (int i = 0; i < lados.size(); i++) {
            MatrizAd[lados.get(i).getNodo1().getId()][lados.get(i).getNodo2().getId()] = 1;
            MatrizAd[lados.get(i).getNodo2().getId()][lados.get(i).getNodo1().getId()] = 1;
        }

        for (int i = 0; i < nodos.size(); i++) {
            for (int j = 0; j < nodos.size(); j++) {
                model.setValueAt(MatrizAd[i][j], i, j);
            }
        }
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        borrarGrafo();
    }//GEN-LAST:event_jButton10ActionPerformed

    public void borrarGrafo() {
        jPanel1.getGraphics().clearRect(1, 1, jPanel1.getWidth() - 2, jPanel1.getHeight() - 2);
        id = 0;
        lados.clear();
        nodos.clear();
        DefaultTableModel model = (DefaultTableModel) mAdyacencia.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        borrarGrafo();
        int n = 0;
        String[] splited = null;
        int MatrizAux[][] = new int[100][100];

        FileDialog dialog = new FileDialog((Frame) null, "Seleccione un archivo de prueba de eficacia");
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        String fileChooser = dialog.getDirectory() + dialog.getFile();

        try {
            File myObj = new File(fileChooser);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                splited = data.split("\\s+");
                for (int i = 0; i < splited.length; i++) {
                    MatrizAux[n][i] = Integer.parseInt(splited[i]);
                }
                n++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        int MatrizAd[][] = new int[n][n];
        DefaultTableModel model = (DefaultTableModel) mAdyacencia.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);

        for (int i = 0; i < n; i++) {
            model.addColumn(i);
            model.addRow(new Object[]{});
        }

        Point p = MouseInfo.getPointerInfo().getLocation();
        p.x = this.getLocation().x;
        p.y = this.getLocation().y;
        int posx1 = (p.x) - 100;
        int posy1 = (p.y) - 30;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                MatrizAd[i][j] = MatrizAux[i][j];
                model.setValueAt(MatrizAd[i][j], i, j);
            }

            Nodo n1 = new Nodo(i, posx1 + 15, posy1 + 10, posx1, posy1, posx1 + 30, posy1 + 30, false);
            posx1 = (int) (Math.random() * (400 - 30 + 1) + 30);
            posy1 += (int) (Math.random() * (5 - 30 + 1) + 30);
            nodos.add(n1);
            n1.DibujarVertice(g);
            id++;

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (MatrizAd[i][j] == 1) {
                    marked.add(nodos.get(j));
                    UnirNodos();
                }
            }
            marked.remove(nodos.get(i));
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite n:"));

        for (int i = 2; i <= n; i++) {
            int test[][] = new int[i][i];
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < i; k++) {
                    if (k == j) {
                        test[j][k] = 0;
                    } else {
                        test[j][k] = 1;
                    }
                }
            }

            borrarGrafo();
            int MatrizAd[][] = new int[i][i];
            DefaultTableModel model = (DefaultTableModel) mAdyacencia.getModel();
            model.setRowCount(0);
            model.setColumnCount(0);

            for (int a = 0; a < i; a++) {
                model.addColumn(a);
                model.addRow(new Object[]{});
            }

            Point p = MouseInfo.getPointerInfo().getLocation();
            p.x = this.getLocation().x;
            p.y = this.getLocation().y;
            int posx1 = (p.x) - 100;
            int posy1 = (p.y) - 30;
            for (int a = 0; a < i; a++) {
                for (int j = 0; j < i; j++) {
                    MatrizAd[a][j] = test[a][j];
                    model.setValueAt(MatrizAd[a][j], a, j);
                }

                Nodo n1 = new Nodo(a, posx1 + 15, posy1 + 10, posx1, posy1, posx1 + 30, posy1 + 30, false);
                posx1 = (int) (Math.random() * (400 - 30 + 1) + 30);
                posy1 += (int) (Math.random() * (5 - 30 + 1) + 30);
                nodos.add(n1);
                n1.DibujarVertice(g);
                id++;
            }

            for (int a = 0; a < i; a++) {
                for (int j = 0; j < i; j++) {
                    if (MatrizAd[a][j] == 1) {
                        marked.add(nodos.get(j));
                        UnirNodos();
                    }
                }
                marked.remove(nodos.get(a));
            }

            particionPerfectaMejorada();
            particionPerfectAantiguo();
        }
        writeFile("particion mejorada");
        writeFile2("particion NO mejorada");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        particionPerfectAantiguo();
    }//GEN-LAST:event_jButton11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mAdyacencia;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
