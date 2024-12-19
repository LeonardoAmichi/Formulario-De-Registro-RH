package AppVisual;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

import Entidades.*;


public class Visual implements ActionListener{

    private JFrame frame;
    private Container container;
    private JLabel titulo;
    private JLabel nome;
    private JTextField tnome;
    private JLabel numeroCelular;
    private JTextField tNumeroCelular;
    private JLabel sexo;
    private JRadioButton homem;
    private JRadioButton mulher;
    private ButtonGroup bGGeneroSexo;
    private JLabel dataNascimento;
    private JComboBox<String> dia;
    private JComboBox<String> mes;
    private JComboBox<String> ano;
    private JLabel endereco;
    private JTextArea tEndereco;
    private JCheckBox termoConcentimento;
    private JButton bSubmeter;
    private JButton bresetar;
    private JTextArea tAOutrasInformacoes;
    private JLabel mensagem;
    private JTextArea jTMensagemErro;
    private JRadioButton rdbtnAdministrador;
    private JRadioButton rdbtnOperario;
    private JRadioButton rdbtnFornecedor;
    private JRadioButton rdbtnVendedor;
    private JLabel lblProfissao;
    private ButtonGroup bGProfissoes;
    private JLabel lblCdigoSetor;
    private JTextField tACodigoSetor;
    private JTextField taAjudaDeCusto;
    private JLabel lblAjudaDeCusto;
    private JLabel lblValorCrdito;
    private JTextField tAValorCredito;
    private JLabel lblValorDvida;
    private JTextField tAValorDivida;
    private JLabel lblValorProduo;
    private JTextField tAValorProducao;
    private JLabel lblValorVendas;
    private JTextField tAValorVendas;
    private JLabel lblSalario;
    private JTextField tASalario;

    private String dias[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String meses[]
            = { "Jan", "Fev", "Mar", "Abr",
            "Mai", "Jun", "Jul", "Ago",
            "Set", "Out", "Nov", "Dez" };
    private String anos[]
            = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019", "2020", "2021", "2022",};
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Visual window = new Visual();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Visual() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

        frame = new JFrame();
        frame.setTitle("Formulario de Registro");
        frame.setBounds(300, 90, 1137, 667);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        container = frame.getContentPane();
        container.setLayout(null);

        titulo = new JLabel("Formulário de Registro");
        titulo.setFont(new Font("Arial", Font.PLAIN, 25));
        titulo.setSize(300, 30);
        titulo.setLocation(313, 30);
        container.add(titulo);

        nome = new JLabel("Nome");
        nome.setFont(new Font("Arial", Font.PLAIN, 20));
        nome.setSize(100, 20);
        nome.setLocation(100, 100);
        container.add(nome);

        tnome = new JTextField();
        tnome.setFont(new Font("Arial", Font.PLAIN, 15));
        tnome.setSize(190, 20);
        tnome.setLocation(200, 100);
        container.add(tnome);

        numeroCelular = new JLabel("Celular");
        numeroCelular.setFont(new Font("Arial", Font.PLAIN, 20));
        numeroCelular.setSize(100, 20);
        numeroCelular.setLocation(100, 150);
        container.add(numeroCelular);

        tNumeroCelular = new JTextField();
        tNumeroCelular.setFont(new Font("Arial", Font.PLAIN, 15));
        tNumeroCelular.setSize(150, 20);
        tNumeroCelular.setLocation(200, 150);
        container.add(tNumeroCelular);

        sexo = new JLabel("Sexo");
        sexo.setFont(new Font("Arial", Font.PLAIN, 20));
        sexo.setSize(100, 20);
        sexo.setLocation(100, 200);
        container.add(sexo);

        homem = new JRadioButton("Homem");
        homem.setFont(new Font("Arial", Font.PLAIN, 15));
        homem.setSelected(true);
        homem.setSize(80, 20);
        homem.setLocation(200, 200);
        container.add(homem);

        mulher = new JRadioButton("Mulher");
        mulher.setFont(new Font("Arial", Font.PLAIN, 15));
        mulher.setSelected(false);
        mulher.setSize(80, 20);
        mulher.setLocation(280, 200);
        container.add(mulher);

        bGGeneroSexo = new ButtonGroup();
        bGGeneroSexo.add(homem);
        bGGeneroSexo.add(mulher);

        dataNascimento = new JLabel("Data Nascimento");
        dataNascimento.setFont(new Font("Arial", Font.PLAIN, 20));
        dataNascimento.setSize(100, 20);
        dataNascimento.setLocation(100, 250);
        container.add(dataNascimento);

        dia = new JComboBox<String>(dias);
        dia.setFont(new Font("Arial", Font.PLAIN, 15));
        dia.setSize(50, 20);
        dia.setLocation(200, 250);
        container.add(dia);

        mes = new JComboBox<String>(meses);
        mes.setFont(new Font("Arial", Font.PLAIN, 15));
        mes.setSize(60, 20);
        mes.setLocation(260, 250);
        container.add(mes);

        ano = new JComboBox<String>(anos);
        ano.setFont(new Font("Arial", Font.PLAIN, 15));
        ano.setSize(60, 20);
        ano.setLocation(330, 250);
        container.add(ano);

        endereco = new JLabel("Endereco");
        endereco.setFont(new Font("Arial", Font.PLAIN, 20));
        endereco.setSize(100, 20);
        endereco.setLocation(100, 300);
        container.add(endereco);

        tEndereco = new JTextArea();
        tEndereco.setFont(new Font("Arial", Font.PLAIN, 15));
        tEndereco.setSize(200, 75);
        tEndereco.setLocation(200, 300);
        tEndereco.setLineWrap(true);
        container.add(tEndereco);

        termoConcentimento = new JCheckBox("Aceitar termos e condições");
        termoConcentimento.setFont(new Font("Arial", Font.PLAIN, 15));
        termoConcentimento.setSize(250, 20);
        termoConcentimento.setLocation(313, 570);
        container.add(termoConcentimento);

        bSubmeter = new JButton("Enviar");
        bSubmeter.setFont(new Font("Arial", Font.PLAIN, 15));
        bSubmeter.setSize(100, 20);
        bSubmeter.setLocation(313, 597);
        bSubmeter.addActionListener((ActionListener) this);
        container.add(bSubmeter);

        bresetar = new JButton("Resetar");
        bresetar.setFont(new Font("Arial", Font.PLAIN, 15));
        bresetar.setSize(100, 20);
        bresetar.setLocation(423, 597);
        bresetar.addActionListener((ActionListener) this);
        container.add(bresetar);

        tAOutrasInformacoes = new JTextArea();
        tAOutrasInformacoes.setFont(new Font("Arial", Font.PLAIN, 15));
        tAOutrasInformacoes.setSize(300, 400);
        tAOutrasInformacoes.setLocation(798, 101);
        tAOutrasInformacoes.setLineWrap(true);
        tAOutrasInformacoes.setEditable(false);
        container.add(tAOutrasInformacoes);

        mensagem = new JLabel("");
        mensagem.setFont(new Font("Arial", Font.PLAIN, 20));
        mensagem.setSize(500, 25);
        mensagem.setLocation(280, 539);
        container.add(mensagem);

        jTMensagemErro = new JTextArea();
        jTMensagemErro.setFont(new Font("Arial", Font.PLAIN, 15));
        jTMensagemErro.setSize(200, 75);
        jTMensagemErro.setLocation(841, 123);
        jTMensagemErro.setLineWrap(true);
        container.add(jTMensagemErro);

        lblProfissao = new JLabel("Profissão");
        lblProfissao.setFont(new Font("Arial", Font.PLAIN, 20));
        lblProfissao.setBounds(363, 462, 100, 20);
        frame.getContentPane().add(lblProfissao);

        rdbtnAdministrador = new JRadioButton("Administrador");
        rdbtnAdministrador.setBounds(411, 489, 91, 23);
        frame.getContentPane().add(rdbtnAdministrador);

        rdbtnOperario = new JRadioButton("Operário");
        rdbtnOperario.setBounds(412, 512, 80, 20);
        frame.getContentPane().add(rdbtnOperario);

        rdbtnFornecedor = new JRadioButton("Fornecedor");
        rdbtnFornecedor.setBounds(330, 512, 80, 20);
        frame.getContentPane().add(rdbtnFornecedor);

        rdbtnVendedor = new JRadioButton("Vendedor");
        rdbtnVendedor.setSelected(true);
        rdbtnVendedor.setBounds(330, 489, 80, 20);
        frame.getContentPane().add(rdbtnVendedor);

        bGProfissoes = new ButtonGroup();
        bGProfissoes.add(rdbtnAdministrador);
        bGProfissoes.add(rdbtnOperario);
        bGProfissoes.add(rdbtnFornecedor);
        bGProfissoes.add(rdbtnVendedor);

        lblCdigoSetor = new JLabel("Código Setor");
        lblCdigoSetor.setFont(new Font("Arial", Font.PLAIN, 20));
        lblCdigoSetor.setBounds(457, 95, 173, 31);
        frame.getContentPane().add(lblCdigoSetor);

        tACodigoSetor = new JTextField();
        tACodigoSetor.setFont(new Font("Arial", Font.PLAIN, 15));
        tACodigoSetor.setBounds(584, 102, 173, 20);
        frame.getContentPane().add(tACodigoSetor);

        lblAjudaDeCusto = new JLabel("Ajuda de Custo");
        lblAjudaDeCusto.setFont(new Font("Arial", Font.PLAIN, 20));
        lblAjudaDeCusto.setBounds(457, 145, 143, 31);
        frame.getContentPane().add(lblAjudaDeCusto);

        taAjudaDeCusto = new JTextField();
        taAjudaDeCusto.setFont(new Font("Arial", Font.PLAIN, 15));
        taAjudaDeCusto.setBounds(596, 152, 161, 20);
        frame.getContentPane().add(taAjudaDeCusto);

        lblValorCrdito = new JLabel("Valor Crédito");
        lblValorCrdito.setFont(new Font("Arial", Font.PLAIN, 20));
        lblValorCrdito.setBounds(457, 195, 123, 30);
        frame.getContentPane().add(lblValorCrdito);

        tAValorCredito = new JTextField();
        tAValorCredito.setFont(new Font("Arial", Font.PLAIN, 15));
        tAValorCredito.setBounds(584, 200, 173, 20);
        frame.getContentPane().add(tAValorCredito);

        lblValorDvida = new JLabel("Valor Dívida");
        lblValorDvida.setFont(new Font("Arial", Font.PLAIN, 20));
        lblValorDvida.setBounds(457, 245, 123, 30);
        frame.getContentPane().add(lblValorDvida);

        tAValorDivida = new JTextField();
        tAValorDivida.setFont(new Font("Arial", Font.PLAIN, 15));
        tAValorDivida.setBounds(573, 253, 184, 20);
        frame.getContentPane().add(tAValorDivida);

        lblValorProduo = new JLabel("Valor Produção");
        lblValorProduo.setFont(new Font("Arial", Font.PLAIN, 20));
        lblValorProduo.setBounds(457, 295, 143, 30);
        frame.getContentPane().add(lblValorProduo);

        tAValorProducao = new JTextField();
        tAValorProducao.setFont(new Font("Arial", Font.PLAIN, 15));
        tAValorProducao.setBounds(602, 302, 155, 20);
        frame.getContentPane().add(tAValorProducao);

        lblValorVendas = new JLabel("Valor Vendas");
        lblValorVendas.setFont(new Font("Arial", Font.PLAIN, 20));
        lblValorVendas.setBounds(457, 345, 143, 30);
        frame.getContentPane().add(lblValorVendas);

        tAValorVendas = new JTextField();
        tAValorVendas.setFont(new Font("Arial", Font.PLAIN, 15));
        tAValorVendas.setBounds(584, 353, 173, 20);
        frame.getContentPane().add(tAValorVendas);
        
        lblSalario = new JLabel("Salário");
        lblSalario.setFont(new Font("Arial", Font.PLAIN, 20));
        lblSalario.setBounds(457, 396, 100, 30);
        frame.getContentPane().add(lblSalario);
        
        tASalario = new JTextField();
        tASalario.setFont(new Font("Arial", Font.PLAIN, 15));
        tASalario.setBounds(534, 404, 223, 20);
        frame.getContentPane().add(tASalario);

        frame.setVisible(true);

    }

    public void erroCondicao(){
        tAOutrasInformacoes.setText("");
        jTMensagemErro.setText("");
        mensagem.setText("Por favor aceite os termos e condições");
        mensagem.setForeground(Color.RED);
    }

    public void erroDados(){
        tAOutrasInformacoes.setText("");
        jTMensagemErro.setText("");
        mensagem.setText("Por favor preencha todos os dados");
        mensagem.setForeground(Color.RED);
    }
    
    public void erroValidacao() {
    	tAOutrasInformacoes.setText("");
        jTMensagemErro.setText("");
        mensagem.setText("Erro na Validação de dados");
        mensagem.setForeground(Color.RED);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == bSubmeter) {
            if (termoConcentimento.isSelected()) {
                String dados1;
                
                String dados
                        = "Nome : "
                        + tnome.getText() + "\n"
                        + "Celular : "
                        + tNumeroCelular.getText() + "\n";
                
                if (homem.isSelected())
                    dados1 = "Sexo : Homem"
                            + "\n";
                else
                    dados1 = "Sexo : Mulher"
                            + "\n";
                String dados2
                        = "Data Nascimento : "
                        + (String)dia.getSelectedItem()
                        + "/" + (String)mes.getSelectedItem()
                        + "/" + (String)ano.getSelectedItem()
                        + "\n";


                //Aqui podemos usar os dados obtidos para montar uma pessoa.
                //Achar se é homem ou mulher
                String sexo = null;
                if(homem.isSelected())
                    sexo = "H";
                else
                    sexo = "M";
                //Montar o objeto Date
                int d = Integer.parseInt(dia.getSelectedItem().toString());
                //Teste dos meses
                int m = -9;
                if(mes.getSelectedItem().toString().equals("Jan"))
                    m = 0;
                if(mes.getSelectedItem().toString().equals("Fev"))
                    m = 1;
                if(mes.getSelectedItem().toString().equals("Mar"))
                    m = 2;
                if(mes.getSelectedItem().toString().equals("Abr"))
                    m = 3;
                if(mes.getSelectedItem().toString().equals("Mai"))
                    m = 4;
                if(mes.getSelectedItem().toString().equals("Jun"))
                    m = 5;
                if(mes.getSelectedItem().toString().equals("Jul"))
                    m = 6;
                if(mes.getSelectedItem().toString().equals("Ago"))
                    m = 7;
                if(mes.getSelectedItem().toString().equals("Set"))
                    m = 8;
                if(mes.getSelectedItem().toString().equals("Out"))
                    m = 9;
                if(mes.getSelectedItem().toString().equals("Nov"))
                    m = 10;
                if(mes.getSelectedItem().toString().equals("Dez"))
                    m = 11;


                int a = Integer.parseInt(ano.getSelectedItem().toString());


                Date dataNascimentoPessoa = new Date(d, m, a);
                
                Pessoa pessoa = new Pessoa(tnome.getText(), tEndereco.getText(), tNumeroCelular.getText(), dataNascimentoPessoa, sexo);
                
                String dados3 = "Endereco : " + tEndereco.getText();
              
                if(rdbtnAdministrador.isSelected()){
                    if(taAjudaDeCusto.getText().isEmpty() || tACodigoSetor.getText().isEmpty() || tASalario.getText().isEmpty()){
                        erroDados();
                    }
                    else{
                    	Double ajudaCusto = Double.parseDouble(taAjudaDeCusto.getText());
                    	Integer codigosetor = Integer.parseInt(tACodigoSetor.getText());
                     	Double salario = Double.parseDouble(tASalario.getText());
                    	Administrador administrador = new Administrador(rdbtnOperario.getText(), ajudaCusto, codigosetor, salario, tNumeroCelular.getText(), tEndereco.getText(), tnome.getText(), dataNascimentoPessoa, sexo);
                    	
                    	if(administrador.isValidCodigoSetor(tACodigoSetor.getText()) == false || administrador.isValidSalario(tASalario.getText()) == false) {
                    		tACodigoSetor.setText("");
                    		tASalario.setText("");
                    		erroValidacao();
                    	}
                    	
                        String dados4 = "\nCargo : " + rdbtnAdministrador.getText()
                                + "\nAjuda de Custo: " + taAjudaDeCusto.getText()
                                + "\nSalário: " + administrador.calcularSalario();
                        tAOutrasInformacoes.setText(dados + dados1 + dados2 + dados3 + dados4 + "\n\n"+ pessoa);
                        tAOutrasInformacoes.setEditable(false);
                        mensagem.setText("Registrado com Sucesso...");
                    }
                }

                if(rdbtnOperario.isSelected()){
                    if(tAValorProducao.getText().isEmpty() || tACodigoSetor.getText().isEmpty() || tASalario.getText().isEmpty()){
                        erroDados();
                    }
                    else{
                    	Double valorProducao = Double.parseDouble(tAValorProducao.getText());
                    	Integer codigosetor = Integer.parseInt(tACodigoSetor.getText());
                     	Double salario = Double.parseDouble(tASalario.getText());
                    	Operario operario = new Operario(rdbtnOperario.getText(), valorProducao, codigosetor, salario, tNumeroCelular.getText(), tEndereco.getText(),tnome.getText(), dataNascimentoPessoa, sexo);
                    	
                        String dados4 = "\nCargo  :" + rdbtnOperario.getText()
                                + "\nValor de Produção: " + tAValorProducao.getText()
                                + "\nSalário: " + operario.calcularSalario();
                        tAOutrasInformacoes.setText(dados + dados1 + dados2 + dados3 + dados4 + "\n\n"+ pessoa);
                        tAOutrasInformacoes.setEditable(false);
                        mensagem.setText("Registrado com Sucesso...");
                    }
                }

                if(rdbtnVendedor.isSelected()) {
                    if (tAValorVendas.getText().isEmpty() || tACodigoSetor.getText().isEmpty() || tASalario.getText().isEmpty()) {
                        erroDados();
                    } else {
                    	Double valorVenda = Double.parseDouble(tAValorVendas.getText());
                    	Integer codigosetor = Integer.parseInt(tACodigoSetor.getText());
                     	Double salario = Double.parseDouble(tASalario.getText());
                    	Vendedor vendedor = new Vendedor(rdbtnVendedor.getText(), valorVenda, codigosetor, salario, tNumeroCelular.getText(), tEndereco.getText(),tnome.getText(), dataNascimentoPessoa, sexo);
                    	
                        String dados4 = "\nCargo  :" + rdbtnVendedor.getText()
                                + "\nValor de Vendas: " + tAValorVendas.getText()
                                + "\nSalário: " + vendedor.calcularSalario();
                        tAOutrasInformacoes.setText(dados + dados1 + dados2 + dados3 + dados4 + "\n\n" + pessoa);
                        tAOutrasInformacoes.setEditable(false);
                        mensagem.setText("Registrado com Sucesso...");
                    }
                }

                if(rdbtnFornecedor.isSelected()) {
                    if (tAValorCredito.getText().isEmpty() || tAValorDivida.getText().isEmpty() || tACodigoSetor.getText().isEmpty() || tASalario.getText().isEmpty()) {
                        erroDados();
                    } else {
                    	
                    	Double valorCredito = Double.parseDouble(tAValorCredito.getText());
                    	Double valorDivida = Double.parseDouble(tAValorDivida.getText());
                    	
                    	Fornecedor fornecedor = new Fornecedor (valorCredito, valorDivida, tNumeroCelular.getText(), tEndereco.getText(),tnome.getText(), dataNascimentoPessoa, sexo);
                    	
                        String dados4 = "\nCargo  :" + rdbtnFornecedor.getText()
                                + "\nValor de Crédito: " + tAValorCredito.getText()
                                + "\nValor de Dívida: " + tAValorDivida.getText()
                                + "Saldo: " + fornecedor.obterSaldo();
           
                        tAOutrasInformacoes.setText(dados + dados1 + dados2 + dados3 + dados4 + "\n\n" + pessoa);
                        tAOutrasInformacoes.setEditable(false);
                        mensagem.setText("Registrado com Sucesso...");
                    }
                }
                
                //Validações
               if(pessoa.isValidNome(tnome.getText())) {
                	pessoa.setNome(tnome.getText());
                }
                else {
                	tnome.setText("");
                	pessoa.setNome("");
                	erroValidacao();
                }
                
                if(pessoa.isValidEndereco(tEndereco.getText())) {
                	pessoa.setEndereco(tEndereco.getText());
                }
                else {
                	tEndereco.setText("");
                	pessoa.setEndereco("");
                	erroValidacao();
                }
                
               if(pessoa.isValidTelefone(tNumeroCelular.getText())) {
                	pessoa.setTelefone(numeroCelular.getText());
                }
                else {
                	tNumeroCelular.setText("");
                	pessoa.setTelefone("");
                	erroValidacao();
                } 
               

            }
            else {
                erroCondicao();
            }
        }

        else if (e.getSource() == bresetar) {
            String def = "";
            tnome.setText(def);
            tEndereco.setText(def);
            tNumeroCelular.setText(def);
            mensagem.setText(def);
            tAOutrasInformacoes.setText(def);
            termoConcentimento.setSelected(false);
            dia.setSelectedIndex(0);
            mes.setSelectedIndex(0);
            ano.setSelectedIndex(0);
            jTMensagemErro.setText(def);
        }
    }
}

