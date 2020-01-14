package VentanaFace;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Pantalla extends JFrame {

    JFrame frame = new JFrame("Facebook");
    JPanel panelSuperior, panelInferior;
    JLabel contraseña, correo, olvido, Registro, l1, l2, l3, l4, l5, l6, l7, l8, l9;
    JButton entrar;
    JTextField t = new JTextField(20);
    JTextField Txt = new JTextField();
    JTextField Txt2 = new JTextField();
    JTextField Txt3 = new JTextField();
    JTextField Txt4 = new JTextField();
    JTextField Txt6 = new JTextField();
    JTextField Txt7 = new JTextField();
    JTextField Txt8 = new JTextField();
    GridBagConstraints a = new GridBagConstraints();
    GridBagConstraints c = new GridBagConstraints();
    GridBagConstraints d = new GridBagConstraints();
    GridBagConstraints b = new GridBagConstraints();

    public void ppanelSuperior() {
        panelSuperior = new JPanel();
        panelSuperior = new JPanel(new GridBagLayout());

        c.weightx = 2;
        c.weighty = 1;
        c.fill = GridBagConstraints.HORIZONTAL;

        correo = new JLabel("Correo Electronico o telefono ");
        correo.setForeground(Color.white);
        c.gridx = 0;
        c.gridy = 0;
        panelSuperior.add(correo, c);

        JTextField TextoCorreo = new JTextField(10);
        c.gridx = 0;
        c.gridy = 1;
        panelSuperior.add(TextoCorreo, c);

        contraseña = new JLabel("Contraseña ");
        contraseña.setForeground(Color.white);
        c.gridx = 1;
        c.gridy = 0;
        panelSuperior.add(contraseña, c);

        JTextField Texto1 = new JTextField(10);
        c.gridx = 1;
        c.gridy = 1;
        panelSuperior.add(Texto1, c);

        entrar = new JButton("Entrar");
        entrar.setForeground(Color.black);
        c.gridx = 2;
        c.gridy = 1;
        panelSuperior.add(entrar, c);

        olvido = new JLabel("¿Has olvidado los datos de tu cuenta ");
        olvido.setForeground(Color.gray);
        c.gridx = 1;
        c.gridy = 3;
        panelSuperior.add(olvido, c);

        panelInferior = new JPanel();
        panelInferior = new JPanel(new GridBagLayout());
        panelSuperior.setBackground(Color.blue);
        Registro = new JLabel("Registrarte");
        Font fuente = new Font("Calibri", 3, 40);
        Registro.setFont(fuente);
        Registro.setForeground(Color.BLACK);
        c.gridx = 0;
        c.gridy = 4;
        panelInferior.add(Registro, c);

        l2 = new JLabel("Es gratis y lo sera siempre");
        c.gridx = 0;
        c.gridy = 5;
        panelInferior.add(l2, c);

        d.weightx = 2;
        d.weighty = 1;
        d.fill = GridBagConstraints.HORIZONTAL;

        Txt = new JTextField("Nombre");
        d.gridx = 0;
        d.gridy = 6;
        panelInferior.add(Txt, d);

        Txt2 = new JTextField("Apellidos");
        d.gridx = 1;
        d.gridy = 6;
        panelInferior.add(Txt2, d);

        Txt3 = new JTextField("Numero de movil o correo electronico");
        c.gridx = 0;
        c.gridwidth = 2;
        c.gridy = 8;
        panelInferior.add(Txt3, c);

        Txt4 = new JTextField("Contraseña nueva");
        c.gridx = 0;
        c.gridwidth = 2;
        c.gridy = 10;
        panelInferior.add(Txt4, c);

        l3 = new JLabel("Fecha de Nacimiento");
        c.gridx = 0;
        c.gridwidth = 0;
        c.gridy = 11;
        panelInferior.add(l3, c);
JLabel l10= new JLabel("Dia");
        c.gridx = 0;
        c.gridwidth = 3;
        c.gridy = 13;
        panelInferior.add(l10, c);
        JLabel l11= new JLabel("Mes");
        c.gridx = 1;
        c.gridwidth = 3;
        c.gridy = 13;
        panelInferior.add(l11, c);
 JLabel l112= new JLabel("Año");
        c.gridx = 2;
        c.gridwidth = 3;
        c.gridy = 13;
        panelInferior.add(l112, c);
     
        Txt6 = new JTextField("Dia");
        JComboBox Txt6 = new JComboBox();
		Txt6.addItem("1");
		Txt6.addItem("2");
		Txt6.addItem("3");
                Txt6.addItem("4");
                Txt6.addItem("5");
                Txt6.addItem("6");
                Txt6.addItem("7");
                Txt6.addItem("8");
                Txt6.addItem("9");
                Txt6.addItem("10");
                Txt6.addItem("11");
                Txt6.addItem("12");
                Txt6.addItem("13");
                Txt6.addItem("14");
                Txt6.addItem("15");
                Txt6.addItem("15");
                Txt6.addItem("17");
                Txt6.addItem("18");
                Txt6.addItem("19");
                Txt6.addItem("20");
                Txt6.addItem("21");
                Txt6.addItem("22");
                Txt6.addItem("23");
                Txt6.addItem("24");
                Txt6.addItem("25");
                Txt6.addItem("26");
                Txt6.addItem("27");
                Txt6.addItem("28");
                Txt6.addItem("29");
                Txt6.addItem("30");
                Txt6.addItem("31");
        d.gridx = 0;
//        b.gridwidth = 0;
        d.gridy = 14;
        panelInferior.add(Txt6, d);

        Txt7 = new JTextField("Mes");
        JComboBox Txt7 = new JComboBox();
Txt7.addItem("1");
		Txt7.addItem("2");
		Txt7.addItem("3");
                Txt7.addItem("4");
                Txt7.addItem("5");
                Txt7.addItem("6");
                Txt7.addItem("7");
                Txt7.addItem("8");
                Txt7.addItem("9");
                Txt7.addItem("10");
                Txt7.addItem("11");
                Txt7.addItem("12");
        d.gridx = 1;
//        b.gridwidth = 0;
        d.gridy = 14;
        panelInferior.add(Txt7, d);

//        Txt8 = new JTextField("año");
        JComboBox Txt8 = new JComboBox();
Txt8.addItem("1950");
Txt8.addItem("1951");
Txt8.addItem("1952");
Txt8.addItem("1953");
Txt8.addItem("1954");
Txt8.addItem("1955");
Txt8.addItem("1956");
Txt8.addItem("1957");
Txt8.addItem("1958");
Txt8.addItem("1959");
Txt8.addItem("1960");
Txt8.addItem("1961");
Txt8.addItem("1962");
Txt8.addItem("1963");
Txt8.addItem("1964");
Txt8.addItem("1965");
Txt8.addItem("1966");
Txt8.addItem("1967");
Txt8.addItem("1968");
Txt8.addItem("1969");
Txt8.addItem("1970");
Txt8.addItem("1971");
Txt8.addItem("1972");
Txt8.addItem("1973");
Txt8.addItem("1974");
Txt8.addItem("1975");
Txt8.addItem("1976");
Txt8.addItem("1977");
Txt8.addItem("1978");
Txt8.addItem("1979");
Txt8.addItem("1980");
Txt8.addItem("1981");
Txt8.addItem("1982");
Txt8.addItem("1983");
Txt8.addItem("1984");
Txt8.addItem("1985");
Txt8.addItem("1986");
Txt8.addItem("1987");
Txt8.addItem("1988");
Txt8.addItem("1989");
Txt8.addItem("1990");
Txt8.addItem("1991");
Txt8.addItem("1992");
Txt8.addItem("1993");
Txt8.addItem("1994");
Txt8.addItem("1995");
Txt8.addItem("1996");
Txt8.addItem("1997");
Txt8.addItem("1998");
Txt8.addItem("1999");
Txt8.addItem("2000");
Txt8.addItem("2001");
Txt8.addItem("2002");
Txt8.addItem("2003");
Txt8.addItem("2004");
Txt8.addItem("2005");
Txt8.addItem("2006");
Txt8.addItem("2007");
Txt8.addItem("2008");
Txt8.addItem("2009");
Txt8.addItem("2010");
Txt8.addItem("2011");
Txt8.addItem("2012");
Txt8.addItem("2013");
Txt8.addItem("2014");
Txt8.addItem("2015");
Txt8.addItem("2016");
Txt8.addItem("2017");
Txt8.addItem("2018");
Txt8.addItem("2019");
Txt8.addItem("2020");
        d.gridx = 2;
//        b.gridwidth = 0;
        d.gridy = 14;
        panelInferior.add(Txt8, d);

        l4 = new JLabel("¿Por qué tengo que facilitar");
        d.gridx = 3;
        d.gridwidth = 3;
        d.gridy = 13;
        panelInferior.add(l4, d);

        l5 = new JLabel(" mi fecha de nacimiento? ");
        d.gridx = 3;
        d.gridwidth = 3;
        d.gridy = 14;
        panelInferior.add(l5, d);

        a.weightx = 2;
        a.weighty = 1;
        a.fill = GridBagConstraints.HORIZONTAL;

        JButton hombre = new JButton("Hombre");
        a.gridx = 1;
        a.gridy = 15;
        panelInferior.add(hombre, a);

        JButton Mujer = new JButton("Mujer");
        a.gridx = 0;
        a.gridy = 15;
        panelInferior.add(Mujer, a);

        l6 = new JLabel("Al hacer clic en Registrarte, aceptas las Condiciones, la Política ");
        d.gridx = 0;
        d.gridwidth = 3;
        d.gridy = 18;
        panelInferior.add(l6, d);

        l7 = new JLabel("de datos y la Política de cookies. Es posible que te enviemos");
        d.gridx = 0;
        d.gridwidth = 3;
        d.gridy = 19;
        panelInferior.add(l7, d);

        l8 = new JLabel("notificaciones por SMS que podrás desactivar cuando quieras ");
        d.gridx = 0;
        d.gridwidth = 3;
        d.gridy = 20;
        panelInferior.add(l8, d);

        JButton Registrarte = new JButton("Registrarte");
        Registrarte.setForeground(Color.white);
        Registrarte.setBackground(Color.green);
        a.gridx = 1;
        a.gridwidth = 3;
        a.gridy = 21;
        panelInferior.add(Registrarte, a);

    }

    public Pantalla() {
        ppanelSuperior();
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.add(panelSuperior);
        this.add(panelInferior);
        panelSuperior.setVisible(true);
        panelInferior.setVisible(true);
        this.setResizable(false);
        this.setSize(600, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
