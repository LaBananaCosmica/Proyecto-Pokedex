/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelos.Pokemon;

/**
 *
 * @author Laura Trujillo
 */
public class Pokedex extends javax.swing.JFrame {

    /**
     * Creates new form Pokedex
     */
    ArrayList infopokes = new ArrayList();
    ArrayList infopokes2 = new ArrayList();
    ArrayList infopokes3 = new ArrayList();
    ArrayList nombresP = new ArrayList();
    String cadenaP;
    DefaultListModel ListaPokemon = new DefaultListModel();
    DefaultListModel ListaPokemonE = new DefaultListModel();
    DefaultListModel pokemonesDescubierto = new DefaultListModel();
    int contador = 0;

    public Pokedex() {
        initComponents();
        btgMenu.add(rb1);
        btgMenu.add(rb2);
        btgMenu.add(rb3);
        btgMenu.add(rb4);
        btgMenu.add(rb5);
        txtNombre.setEnabled(false);
        cbxTipo.setEnabled(false);
        txtSexo.setEnabled(false);
        txtNombre.setEnabled(false);
        txtHabili.setEnabled(false);
        btBajar.setEnabled(false);
        btimagen.setEnabled(false);
        btGuardar.setEnabled(false);
        btBPA.setEnabled(false);
        btAE.setEnabled(false);
        btBE.setEnabled(false);
        btBLP.setEnabled(false);
        ListaPokemon = new DefaultListModel();
        jlistPoke.setModel(ListaPokemon);
        txtForta.setEnabled(false);
        txtDebi.setEnabled(false);
        ListaPokemonE = new DefaultListModel();
        jlistEqupo.setModel(ListaPokemonE);
        pokemonesDescubierto = new DefaultListModel();
        jlistPokeDescu.setModel(pokemonesDescubierto);
        pokemonesDescubierto.addElement("Bulbasaur");
        pokemonesDescubierto.addElement("Charmander");
        pokemonesDescubierto.addElement("Squirtle");
        pokemonesDescubierto.addElement("Caterpie");
        pokemonesDescubierto.addElement("Kakuna");
        pokemonesDescubierto.addElement("Pidgey");
        pokemonesDescubierto.addElement("Pikachu");
        pokemonesDescubierto.addElement("Sandslash");
        pokemonesDescubierto.addElement("Clefairy");
        pokemonesDescubierto.addElement("Zubat");
        infopokes3.add("Nombre: Bulbasaur" + ",\n" + "Tipo: Planta" + ",\n" + "Sexo: Hembra" + ",\n" + "Habilidad: Espesura" + ",\n" + "Fortalezas: Agua, Tierra, Roca" + ",\n" + "Debilidades: Fuego, Hielo, Veneno," + "Volador, Bicho" + ";");
        infopokes3.add("Nombre: Charmander" + ",\n" + "Tipo: Fuego" + ",\n" + "Sexo: Macho" + ",\n" + "Habilidad: Mar llamas" + ",\n" + "Fortalezas: Planta, Hielo, Bicho," + "Acero" + ",\n" + "Debilidades: Agua, Tierra, Roca" + ";");
        infopokes3.add("Nombre: Squirtle" + ",\n" + "Tipo: Agua" + ",\n" + "Sexo: Hembra" + ",\n" + "Habilidad: Torrente" + ",\n" + "Fortalezas: Fuego, Tierra, Roca" + ",\n" + "Debilidades: Planta, Eléctrico" + ";");
        infopokes3.add("Nombre: Caterpie" + ",\n" + "Tipo: Bicho" + ",\n" + "Sexo: Hembra" + ",\n" + "Habilidad: Polvo escudo" + ",\n" + "Fortalezas: Planta, Psíquico," + "Siniestro" + ",\n" + "Debilidades: Volador, Roca, Fuego" + ";");
        infopokes3.add("Nombre: Kakuna" + ",\n" + "Tipo: Bicho" + ",\n" + "Sexo: Macho" + ",\n" + "Habilidad: Mudar" + ",\n" + "Fortalezas: Planta, Psíquico," + "Siniestro" + ",\n" + "Debilidades: Volador, Roca, Fuego" + ";");
        infopokes3.add("Nombre: Pidgey" + ",\n" + "Tipo: Normal" + ",\n" + "Sexo: Macho" + ",\n" + "Habilidad: Vista lince" + ",\n" + "Fortalezas: Ninguno" + ",\n" + "Debilidades: Lucha" + ";");
        infopokes3.add("Nombre: Pikachu" + ",\n" + "Tipo: Electrico" + ",\n" + "Sexo: Macho" + ",\n" + "Habilidad: Electricidad estática" + ",\n" + "Fortalezas: Agua, Volador" + ",\n" + "Debilidades: Tierra" + ";");
        infopokes3.add("Nombre: Sandslash" + ",\n" + "Tipo: Tierra" + ",\n" + "Sexo: Hembra" + ",\n" + "Habilidad: velo arena" + ",\n" + "Fortalezas: Fuego, Eléctrico," + "Veneno, Roca," + "Acero" + ",\n" + "Debilidades: Agua, Planta, Hielo" + ";");
        infopokes3.add("Nombre: Clefairy" + ",\n" + "Tipo: Hada" + ",\n" + "Sexo: Hembra" + ",\n" + "Habilidad: Muro mágico" + ",\n" + "Fortalezas: Lucha, Dragón," + "Siniestro" + ",\n" + "Debilidades: Veneno, Acero" + ";");
        infopokes3.add("Nombre: Zubat" + ",\n" + "Tipo: Veneno" + ",\n" + "Sexo: Macho" + ",\n" + "Habilidad: Foco interno" + ",\n" + "Fortalezas: Planta, Hada" + ",\n" + "Debilidades: Tierra, Psíquico" + ";");
    }

    public void guardar() {
        String nombre = txtNombre.getText();
        String tipo = cbxTipo.getItemAt(cbxTipo.getSelectedIndex());
        String sexo = txtSexo.getText();
        String Habilidades = txtHabili.getText();
        String frotaleza = txtForta.getText();
        String Debilidades = txtDebi.getText();

        Pokemon mipoke = new Pokemon();
        mipoke.setNombre(nombre);
        mipoke.setTipo(tipo);
        mipoke.setSexo(sexo);
        mipoke.setHabilidades(Habilidades);
        mipoke.setFortalizas(frotaleza);
        mipoke.setDebilidades(Debilidades);

        String cadena = "Nombre: "+nombre + ",\nTipo: " + tipo + ",\nSexo: " + sexo + ",\nHabilidades: " + Habilidades + ",\nFortalezas: " + frotaleza + ",\nDebilidades: " + Debilidades + ";";
        cadenaP = cadena;
        infopokes.add(cadena);
        nombresP.add(nombre);

    }

    public void limpiar() {
        txtNombre.setText("");
        cbxTipo.setSelectedIndex(0);
        txtSexo.setText("");
        txtHabili.setText("");
        txtForta.setText("");
        txtDebi.setText("");
    }

    public void pasarDatos(String n) {
        if (n.equals("Normal")) {
            txtForta.setText("Ninguno");
            txtDebi.setText("Lucha");
        } else if (n.equals("Fuego")) {
            txtForta.setText("Planta, Hielo, Bicho," + "Acero");
            txtDebi.setText("Agua, Tierra, Roca");
        } else if (n.equals("Agua")) {
            txtForta.setText("Fuego, Tierra, Roca");
            txtDebi.setText("Planta, Eléctrico");
        } else if (n.equals("Planta")) {
            txtForta.setText("Agua, Tierra, Roca");
            txtDebi.setText("Fuego, Hielo, Veneno," + "Volador, Bicho");
        } else if (n.equals("Electrico")) {
            txtForta.setText("Agua, Volador");
            txtDebi.setText("Tierra");
        } else if (n.equals("Hielo")) {
            txtForta.setText("Planta, Tierra," + "Volador, Dragón");
            txtDebi.setText("Fuego, Lucha, Roca," + "Acero");
        } else if (n.equals("Lucha")) {
            txtForta.setText("Normal, Hielo, Roca," + "Siniestro, Acero");
            txtDebi.setText("Volador, Psíquico," + "Hada");
        } else if (n.equals("Veneno")) {
            txtForta.setText("Planta, Hada");
            txtDebi.setText("Tierra, Psíquico");
        } else if (n.equals("Tierra")) {
            txtForta.setText("Fuego, Eléctrico," + "Veneno, Roca," + "Acero");
            txtDebi.setText("Agua, Planta, Hielo");
        } else if (n.equals("Volador")) {
            txtForta.setText("Planta, Lucha, Bicho");
            txtDebi.setText("Eléctrico, Hielo, Roca");
        } else if (n.equals("Psiquico")) {
            txtForta.setText("Lucha, Veneno");
            txtDebi.setText("Bicho, Fantasma," + "Siniestro");
        } else if (n.equals("Bicho")) {
            txtForta.setText("Planta, Psíquico," + "Siniestro");
            txtDebi.setText("Volador, Roca, Fuego");
        } else if (n.equals("Roca")) {
            txtForta.setText("Fuego, Hielo," + "Volador, Bicho");
            txtDebi.setText("Agua, Planta, Lucha," + "Tierra, Acero");
        } else if (n.equals("Fantasma")) {
            txtForta.setText("Psíquico, Fantasma");
            txtDebi.setText("Fantasma, Siniestro");
        } else if (n.equals("Dragon")) {
            txtForta.setText("Dragón");
            txtDebi.setText("Hielo, Dragón, Hada");
        } else if (n.equals("Siniestro")) {
            txtForta.setText("Psíquico, Fantasma");
            txtDebi.setText("Lucha, Bicho, Hada");
        } else if (n.equals("Acero")) {
            txtForta.setText("Hielo, Roca, Hada");
            txtDebi.setText("Fuego, Lucha, Tierra");
        } else if (n.equals("Hada")) {
            txtForta.setText("Lucha, Dragón," + "Siniestro");
            txtDebi.setText("Veneno, Acero");
        }
    }

    public void añadir(int num) {
        if (contador < 6) {
            infopokes2.add(infopokes.get(num));
            String nombre = nombresP.get(num).toString();
            ListaPokemonE.addElement(nombre);
            contador++;
        } else {
            JOptionPane.showMessageDialog(null, "Ya tienes los 6 integrantes de tu equipo");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgMenu = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btimagen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHabili = new javax.swing.JTextField();
        txtForta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDebi = new javax.swing.JTextField();
        btBajar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistPoke = new javax.swing.JList<>();
        btBPA = new javax.swing.JButton();
        btAE = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        rb5 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlistEqupo = new javax.swing.JList<>();
        btBE = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlistPokeDescu = new javax.swing.JList<>();
        btBLP = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("INGRESO POKEMONES"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btimagen.setText("AGREGAR IMAGEN");
        btimagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btimagenActionPerformed(evt);
            }
        });
        jPanel2.add(btimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-puzzled-100.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        btGuardar.setText("GUARDAR");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, -1));

        jLabel3.setText("Tipo:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno...", "Normal", "Fuego", "Agua", "Planta", "Electrico", "Hielo", "Lucha", "Veneno", "Tierra", "Volador", "Psiquico", "Bicho", "Roca", "Fantasma", "Dragon ", "Siniestro", "Acero", "Hada" }));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });
        jPanel2.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, -1));

        jLabel4.setText("Sexo:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        txtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexoActionPerformed(evt);
            }
        });
        jPanel2.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 190, -1));

        jLabel5.setText("Habilidades:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        jPanel2.add(txtHabili, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, -1));
        jPanel2.add(txtForta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 260, -1));

        jLabel6.setText("Fortalezas:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel7.setText("Debilidades:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        txtDebi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDebiActionPerformed(evt);
            }
        });
        jPanel2.add(txtDebi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 260, -1));

        btBajar.setText(" ↧");
        btBajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBajarActionPerformed(evt);
            }
        });
        jPanel2.add(btBajar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 50, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 509, 322));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("POKEMONES ATRAPADOS"));

        jScrollPane1.setViewportView(jlistPoke);

        btBPA.setText("BUSCAR INFO");
        btBPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBPAActionPerformed(evt);
            }
        });

        btAE.setText("AÑADIR A EQUIPO");
        btAE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btBPA)
                .addGap(18, 18, 18)
                .addComponent(btAE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBPA)
                    .addComponent(btAE))
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, 320));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("MENU DE OPCIONES"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("ACTIVAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 389, 110, 36));

        rb1.setText("INGRESAR POKEMONES");
        jPanel4.add(rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        rb2.setText("VER INFORMACION DE POKEMONES ");
        jPanel4.add(rb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        rb3.setText("ADMINISTRAR POKEMONES DE AVENTURA");
        jPanel4.add(rb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        rb4.setText("VISUALIZAR LISTA POKEMONES");
        jPanel4.add(rb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        rb5.setText("POKEMONES DESCUBIERTOS");
        jPanel4.add(rb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel8.setText("Selecciona  que quieres hacer en tu pokedex:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 280, 40, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 320, 460));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("EQUIPO"));

        jScrollPane2.setViewportView(jlistEqupo);

        btBE.setText("BUSCAR INFO");
        btBE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btBE)
                .addGap(84, 84, 84))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btBE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 290, 290));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA POKEMONES DESCUBIERTOS"));

        jScrollPane3.setViewportView(jlistPokeDescu);

        btBLP.setText("BUSCAR INFO");
        btBLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBLPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btBLP)
                .addGap(159, 159, 159))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btBLP)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 450, 270));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CapturaSinf.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 240, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoActionPerformed

    private void txtDebiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDebiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDebiActionPerformed

    private void txtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexoActionPerformed

    private void btBPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBPAActionPerformed
        int num = jlistPoke.getSelectedIndex();
        //JOptionPane.showMessageDialog(null, "numero:"+num);
        JOptionPane.showMessageDialog(null, "Info del pokemon: " + infopokes.get(num));
        btBPA.setEnabled(false);

    }//GEN-LAST:event_btBPAActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        String nombre = txtNombre.getText();
        ListaPokemon.addElement(nombre);
        guardar();
        limpiar();
        txtNombre.setEnabled(false);
        cbxTipo.setEnabled(false);
        txtSexo.setEnabled(false);
        txtNombre.setEnabled(false);
        txtHabili.setEnabled(false);
        btBajar.setEnabled(false);
        btimagen.setEnabled(false);
        btGuardar.setEnabled(false);
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btBajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBajarActionPerformed
        String dato = cbxTipo.getItemAt(cbxTipo.getSelectedIndex());
        pasarDatos(dato);
        guardar();
    }//GEN-LAST:event_btBajarActionPerformed

    private void btAEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAEActionPerformed
        int num = jlistPoke.getSelectedIndex();
        añadir(num);
        btAE.setEnabled(false);
    }//GEN-LAST:event_btAEActionPerformed

    private void btBEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBEActionPerformed
        int num = jlistEqupo.getSelectedIndex();
        JOptionPane.showMessageDialog(null, "Info del pokemon: " + infopokes2.get(num));
        btBE.setEnabled(false);
    }//GEN-LAST:event_btBEActionPerformed

    private void btBLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBLPActionPerformed
        int num = jlistPokeDescu.getSelectedIndex();
        JOptionPane.showMessageDialog(null, "Info del pokemon: " + infopokes3.get(num));
        btBLP.setEnabled(false);
    }//GEN-LAST:event_btBLPActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (rb1.isSelected()) {
            txtNombre.setEnabled(true);
            cbxTipo.setEnabled(true);
            txtSexo.setEnabled(true);
            txtNombre.setEnabled(true);
            txtHabili.setEnabled(true);
            btBajar.setEnabled(true);
            btimagen.setEnabled(true);
            btGuardar.setEnabled(true);
        } else if (rb2.isSelected()) {
            btBPA.setEnabled(true);
        } else if (rb3.isSelected()) {
            btAE.setEnabled(true);
        } else if (rb4.isSelected()) {
            btBE.setEnabled(true);
        } else if (rb5.isSelected()) {
            btBLP.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Ninguna opcion seleccionada");
        }
        btgMenu.clearSelection();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btimagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btimagenActionPerformed
        JOptionPane.showMessageDialog(null, "En mantenimiento, agregar los demas datos sin la imagen profavor");
    }//GEN-LAST:event_btimagenActionPerformed

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
            java.util.logging.Logger.getLogger(Pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pokedex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAE;
    private javax.swing.JButton btBE;
    private javax.swing.JButton btBLP;
    private javax.swing.JButton btBPA;
    private javax.swing.JButton btBajar;
    private javax.swing.JButton btGuardar;
    private javax.swing.ButtonGroup btgMenu;
    private javax.swing.JButton btimagen;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> jlistEqupo;
    private javax.swing.JList<String> jlistPoke;
    private javax.swing.JList<String> jlistPokeDescu;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    private javax.swing.JTextField txtDebi;
    private javax.swing.JTextField txtForta;
    private javax.swing.JTextField txtHabili;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
