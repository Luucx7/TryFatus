/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.ClienteDAO;
import dao.JurosDAO;
import dao.VendaDAO;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import model.Cliente;
import util.AutoCompletion;
import static util.DateConvert.DateConvert;
import util.ValidaCPF;

/**
 *
 * @author USER
 */
public class Main extends javax.swing.JFrame {

    public static Cliente cliente = new Cliente();
    /**
     * Creates new form Main
     */
    public Main() {
        try {
            this.setIconImage(ImageIO.read(new File("img/icon.png")));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        jLnome.setVisible(false);
        jLcelular.setVisible(false);
        jLcpf.setVisible(false);
        jLrg.setVisible(false);
        jLtelefone.setVisible(false);
        jLemail.setVisible(false);
        jLendereco.setVisible(false);
        jLnasc.setVisible(false);
        jLbairro.setVisible(false);
        jLcidade.setVisible(false);
        jLestado.setVisible(false);
        jLemAbertoQntd.setText("");
        jLabertasQntd.setText("");
        jLtotalCQntd.setText("");
        jLjurosTotValor.setText("");
        
        // Inicializador de Juros
        JurosDAO.checarJuros();
        
        // Campo de Busca
        //ClienteDAO.ClienteBusca(jCBcliente);
        //AutoCompletion.enable(jCBcliente);
        AtualizarBusca();
    }

    public void AtualizarBusca() {
        ClienteDAO.ClienteBusca(jCBcliente);
        AutoCompletion.enable(jCBcliente);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPmain = new javax.swing.JPanel();
        jPnGerenciamento = new javax.swing.JPanel();
        jLcliente = new javax.swing.JLabel();
        jBpesquisar = new javax.swing.JButton();
        jBcadastrar = new javax.swing.JButton();
        jCBcliente = new javax.swing.JComboBox<>();
        jPnCliente = new javax.swing.JPanel();
        jLnomeF = new javax.swing.JLabel();
        jLcpfF = new javax.swing.JLabel();
        jLrgF = new javax.swing.JLabel();
        jLtelF = new javax.swing.JLabel();
        jLcelF = new javax.swing.JLabel();
        jLendeF = new javax.swing.JLabel();
        jLemailF = new javax.swing.JLabel();
        jLbairroF = new javax.swing.JLabel();
        jLcidadeF = new javax.swing.JLabel();
        jLnascF = new javax.swing.JLabel();
        jLestadoF = new javax.swing.JLabel();
        jLnome = new javax.swing.JLabel();
        jLcpf = new javax.swing.JLabel();
        jLrg = new javax.swing.JLabel();
        jLcelular = new javax.swing.JLabel();
        jLtelefone = new javax.swing.JLabel();
        jLemail = new javax.swing.JLabel();
        jLendereco = new javax.swing.JLabel();
        jLbairro = new javax.swing.JLabel();
        jLcidade = new javax.swing.JLabel();
        jLestado = new javax.swing.JLabel();
        jLnasc = new javax.swing.JLabel();
        jBalterar = new javax.swing.JButton();
        jPnVendas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jBvenda = new javax.swing.JButton();
        jBpagamento = new javax.swing.JButton();
        jPnResumo = new javax.swing.JPanel();
        jLtotalC = new javax.swing.JLabel();
        jLemAberto = new javax.swing.JLabel();
        jLtotalCQntd = new javax.swing.JLabel();
        jLemAbertoQntd = new javax.swing.JLabel();
        jLabertasQntd = new javax.swing.JLabel();
        jLfechadas = new javax.swing.JLabel();
        jLjurosTot = new javax.swing.JLabel();
        jLjurosTotValor = new javax.swing.JLabel();
        jMbBarra = new javax.swing.JMenuBar();
        jMadmin = new javax.swing.JMenu();
        jMiJuros = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TryFatus");
        setAutoRequestFocus(false);
        setBackground(java.awt.Color.cyan);

        jPmain.setBackground(new java.awt.Color(56, 56, 56));

        jPnGerenciamento.setBackground(new java.awt.Color(56, 56, 56));
        jPnGerenciamento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerenciamento", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        jLcliente.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLcliente.setText("Cliente:");
        jLcliente.setForeground(new Color(187,187,187));

        jBpesquisar.setText("Pesquisar");
        jBpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpesquisarActionPerformed(evt);
            }
        });

        jBcadastrar.setText("Cadastrar Novo");
        jBcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastrarActionPerformed(evt);
            }
        });

        jCBcliente.setEditable(true);
        jCBcliente.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jCBcliente.setBackground(new Color(69,73,74));
        jCBcliente.setForeground(new Color(187, 187, 187));

        javax.swing.GroupLayout jPnGerenciamentoLayout = new javax.swing.GroupLayout(jPnGerenciamento);
        jPnGerenciamento.setLayout(jPnGerenciamentoLayout);
        jPnGerenciamentoLayout.setHorizontalGroup(
            jPnGerenciamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnGerenciamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLcliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBpesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBcadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPnGerenciamentoLayout.setVerticalGroup(
            jPnGerenciamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnGerenciamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnGerenciamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcliente)
                    .addComponent(jBpesquisar)
                    .addComponent(jBcadastrar)
                    .addComponent(jCBcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPnCliente.setBackground(new java.awt.Color(56, 56, 56));
        jPnCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        jLnomeF.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLnomeF.setText("Nome:");
        jLnomeF.setForeground(new Color(187,187,187));

        jLcpfF.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLcpfF.setText("CPF:");
        jLcpfF.setForeground(new Color(187,187,187));

        jLrgF.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLrgF.setText("RG:");
        jLrgF.setForeground(new Color(187,187,187));

        jLtelF.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLtelF.setText("Telefone:");
        jLtelF.setForeground(new Color(187,187,187));

        jLcelF.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLcelF.setText("Celular:");
        jLcelF.setForeground(new Color(187,187,187));

        jLendeF.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLendeF.setText("Endereço:");
        jLendeF.setForeground(new Color(187,187,187));

        jLemailF.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLemailF.setText("Email:");
        jLemailF.setForeground(new Color(187,187,187));

        jLbairroF.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLbairroF.setText("Bairro:");
        jLbairroF.setForeground(new Color(187,187,187));

        jLcidadeF.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLcidadeF.setText("Cidade:");
        jLcidadeF.setForeground(new Color(187,187,187));

        jLnascF.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLnascF.setText("Nascimento:");
        jLnascF.setForeground(new Color(187,187,187));

        jLestadoF.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLestadoF.setText("Estado:");
        jLestadoF.setForeground(new Color(187,187,187));

        jLnome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLnome.setText("Fulano deTal nome grande");
        jLnome.setEnabled(false);
        jLnome.setForeground(new Color(187, 187, 187));

        jLcpf.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLcpf.setText("000.000.000-00");
        jLcpf.setEnabled(false);

        jLrg.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLrg.setText("666.666.666");
        jLrg.setEnabled(false);

        jLcelular.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLcelular.setText("11940028922");
        jLcelular.setEnabled(false);

        jLtelefone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLtelefone.setText("4832553537");
        jLtelefone.setEnabled(false);

        jLemail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLemail.setText("aaaaaaaa@hotmail.com");
        jLemail.setEnabled(false);

        jLendereco.setText("aaaaaaaaaaa");
        jLendereco.setEnabled(false);

        jLbairro.setText("Vila Nova Alvorada");
        jLbairro.setEnabled(false);

        jLcidade.setText("São José do Rio Preto");
        jLcidade.setEnabled(false);

        jLestado.setText("SC");
        jLestado.setEnabled(false);

        jLnasc.setText("07/03/2001");
        jLnasc.setEnabled(false);

        jBalterar.setText("Alterar Dados");
        jBalterar.setEnabled(false);
        jBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnClienteLayout = new javax.swing.GroupLayout(jPnCliente);
        jPnCliente.setLayout(jPnClienteLayout);
        jPnClienteLayout.setHorizontalGroup(
            jPnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnClienteLayout.createSequentialGroup()
                        .addComponent(jLnomeF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLnome))
                    .addGroup(jPnClienteLayout.createSequentialGroup()
                        .addComponent(jLcpfF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLcpf))
                    .addGroup(jPnClienteLayout.createSequentialGroup()
                        .addComponent(jLrgF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLrg))
                    .addGroup(jPnClienteLayout.createSequentialGroup()
                        .addComponent(jLcelF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLcelular))
                    .addGroup(jPnClienteLayout.createSequentialGroup()
                        .addComponent(jLtelF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLtelefone))
                    .addGroup(jPnClienteLayout.createSequentialGroup()
                        .addComponent(jLemailF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLemail))
                    .addGroup(jPnClienteLayout.createSequentialGroup()
                        .addComponent(jLendeF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLendereco))
                    .addGroup(jPnClienteLayout.createSequentialGroup()
                        .addComponent(jLbairroF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLbairro))
                    .addGroup(jPnClienteLayout.createSequentialGroup()
                        .addComponent(jLcidadeF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLcidade))
                    .addGroup(jPnClienteLayout.createSequentialGroup()
                        .addComponent(jLestadoF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLestado))
                    .addGroup(jPnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBalterar)
                        .addGroup(jPnClienteLayout.createSequentialGroup()
                            .addComponent(jLnascF)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLnasc))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnClienteLayout.setVerticalGroup(
            jPnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnClienteLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnomeF)
                    .addComponent(jLnome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcpfF)
                    .addComponent(jLcpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLrgF)
                    .addComponent(jLrg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcelF)
                    .addComponent(jLcelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLtelF)
                    .addComponent(jLtelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLemailF)
                    .addComponent(jLemail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLendeF)
                    .addComponent(jLendereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbairroF)
                    .addComponent(jLbairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcidadeF)
                    .addComponent(jLcidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLestadoF)
                    .addComponent(jLestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnascF)
                    .addComponent(jLnasc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBalterar)
                .addContainerGap())
        );

        jPnVendas.setBackground(new java.awt.Color(56, 56, 56));
        jPnVendas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Vendas", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Valor Total", "Valor Pago", "Parcelas", "Método de Pagamento", "Data da Compra", "Vencimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.setToolTipText("");
        Tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabela);

        jBvenda.setText("Adicionar Venda");
        jBvenda.setEnabled(false);
        jBvenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvendaActionPerformed(evt);
            }
        });

        jBpagamento.setText("Registrar Pagamento");
        jBpagamento.setEnabled(false);
        jBpagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpagamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnVendasLayout = new javax.swing.GroupLayout(jPnVendas);
        jPnVendas.setLayout(jPnVendasLayout);
        jPnVendasLayout.setHorizontalGroup(
            jPnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPnVendasLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jBvenda)
                .addGap(161, 161, 161)
                .addComponent(jBpagamento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnVendasLayout.setVerticalGroup(
            jPnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnVendasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBvenda)
                    .addComponent(jBpagamento))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPnResumo.setBackground(new java.awt.Color(56, 56, 56));
        jPnResumo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resumo Financeiro", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        jLtotalC.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLtotalC.setText("Total em Compras:");
        jLtotalC.setForeground(new Color(187,187,187));

        jLemAberto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLemAberto.setText("Em Aberto:");
        jLemAberto.setForeground(new Color(187,187,187));

        jLtotalCQntd.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLtotalCQntd.setText("899,57");
        jLtotalCQntd.setEnabled(false);

        jLemAbertoQntd.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLemAbertoQntd.setText("572,49");
        jLemAbertoQntd.setEnabled(false);

        jLabertasQntd.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabertasQntd.setText("5");
        jLabertasQntd.setEnabled(false);

        jLfechadas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLfechadas.setText("Compras Abertas:");
        jLfechadas.setForeground(new Color(187,187,187));

        jLjurosTot.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLjurosTot.setText("Juros Total:");
        jLjurosTot.setForeground(new Color(187,187,187));

        jLjurosTotValor.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLjurosTotValor.setText("5");
        jLjurosTotValor.setForeground(new Color(187,187,187));
        jLjurosTotValor.setEnabled(false);

        javax.swing.GroupLayout jPnResumoLayout = new javax.swing.GroupLayout(jPnResumo);
        jPnResumo.setLayout(jPnResumoLayout);
        jPnResumoLayout.setHorizontalGroup(
            jPnResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnResumoLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLtotalC)
                .addGap(7, 7, 7)
                .addComponent(jLtotalCQntd)
                .addGap(35, 35, 35)
                .addComponent(jLemAberto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLemAbertoQntd)
                .addGap(42, 42, 42)
                .addComponent(jLfechadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabertasQntd)
                .addGap(47, 47, 47)
                .addComponent(jLjurosTot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLjurosTotValor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnResumoLayout.setVerticalGroup(
            jPnResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnResumoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLfechadas)
                        .addComponent(jLabertasQntd)
                        .addComponent(jLjurosTot)
                        .addComponent(jLjurosTotValor))
                    .addGroup(jPnResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLemAberto)
                        .addComponent(jLemAbertoQntd))
                    .addGroup(jPnResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLtotalC)
                        .addComponent(jLtotalCQntd)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPmainLayout = new javax.swing.GroupLayout(jPmain);
        jPmain.setLayout(jPmainLayout);
        jPmainLayout.setHorizontalGroup(
            jPmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPmainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPmainLayout.createSequentialGroup()
                        .addGroup(jPmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPnGerenciamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPnVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPnResumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPmainLayout.setVerticalGroup(
            jPmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPmainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPmainLayout.createSequentialGroup()
                        .addComponent(jPnGerenciamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPnResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMadmin.setText("Admin");

        jMiJuros.setText("Juros");
        jMiJuros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMiJurosMouseClicked(evt);
            }
        });
        jMadmin.add(jMiJuros);

        jMbBarra.add(jMadmin);

        setJMenuBar(jMbBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadastrarActionPerformed
        // TODO add your handling code here:
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
    }//GEN-LAST:event_jBcadastrarActionPerformed

    private void jBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarActionPerformed
        // TODO add your handling code here:
        Alterar alterar = new Alterar();
        alterar.setVisible(true);
    }//GEN-LAST:event_jBalterarActionPerformed

    private void jBpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpesquisarActionPerformed
        // TODO add your handling code here:
        String clienteS = jCBcliente.getSelectedItem().toString();
        String substring = clienteS.substring(clienteS.length()-11, clienteS.length());
        cliente = ClienteDAO.Busca(substring);
        
        jLnome.setText(cliente.getNome());
        jLcelular.setText(cliente.getCelular());
        jLcpf.setText(ValidaCPF.imprimeCPF(cliente.getCPF()));
        jLrg.setText(cliente.getRG());
        jLtelefone.setText(cliente.getTelefone());
        jLemail.setText(cliente.getEmail());
        jLendereco.setText(cliente.getEndereco());
        jLbairro.setText(cliente.getBairro());
        jLcidade.setText(cliente.getCidade());
        jLestado.setText(cliente.getEstado());
        jLnasc.setText(DateConvert(cliente.getNascimento()));
        //
        jLnome.setVisible(true);
        jLcelular.setVisible(true);
        jLcpf.setVisible(true);
        jLrg.setVisible(true);
        jLtelefone.setVisible(true);
        jLemail.setVisible(true);
        jLendereco.setVisible(true);
        jLnasc.setVisible(true);
        jLbairro.setVisible(true);
        jLcidade.setVisible(true);
        jLestado.setVisible(true);
        jBalterar.setEnabled(true);
        
        jBvenda.setEnabled(true);
        jBpagamento.setEnabled(true);
        VendaDAO.PopularJTable("SELECT * FROM vendas WHERE Clientes_CPF='"+cliente.getCPF()+"'", Tabela);
        //
        jLemAbertoQntd.setText(VendaDAO.pegarValorAberto(cliente)+"");
        jLtotalCQntd.setText(VendaDAO.pegarTotal(cliente)+"");
        jLabertasQntd.setText(VendaDAO.pegarAbertos(cliente)+"");
        jLjurosTotValor.setText(JurosDAO.calcularJurosTotal(cliente)+"");
        AtualizarBusca();
    }//GEN-LAST:event_jBpesquisarActionPerformed

    private void jBvendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvendaActionPerformed
        // TODO add your handling code here:
        Vendas venda = new Vendas();
        venda.setVisible(true);
    }//GEN-LAST:event_jBvendaActionPerformed

    private void jBpagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpagamentoActionPerformed
        // TODO add your handling code here:
        Pagamento pagto = new Pagamento();
        pagto.setVisible(true);
    }//GEN-LAST:event_jBpagamentoActionPerformed

    private void jMiJurosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMiJurosMouseClicked
        // TODO add your handling code here:
        JurosDAO.setarJuros(Double.parseDouble(JOptionPane.showInputDialog("Taxa de Juros do sistema: "+JurosDAO.pegarJuros())));
    }//GEN-LAST:event_jMiJurosMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton jBalterar;
    private javax.swing.JButton jBcadastrar;
    private javax.swing.JButton jBpagamento;
    private javax.swing.JButton jBpesquisar;
    private javax.swing.JButton jBvenda;
    private javax.swing.JComboBox<String> jCBcliente;
    private javax.swing.JLabel jLabertasQntd;
    private javax.swing.JLabel jLbairro;
    private javax.swing.JLabel jLbairroF;
    private javax.swing.JLabel jLcelF;
    private javax.swing.JLabel jLcelular;
    private javax.swing.JLabel jLcidade;
    private javax.swing.JLabel jLcidadeF;
    private javax.swing.JLabel jLcliente;
    private javax.swing.JLabel jLcpf;
    private javax.swing.JLabel jLcpfF;
    private javax.swing.JLabel jLemAberto;
    private javax.swing.JLabel jLemAbertoQntd;
    private javax.swing.JLabel jLemail;
    private javax.swing.JLabel jLemailF;
    private javax.swing.JLabel jLendeF;
    private javax.swing.JLabel jLendereco;
    private javax.swing.JLabel jLestado;
    private javax.swing.JLabel jLestadoF;
    private javax.swing.JLabel jLfechadas;
    private javax.swing.JLabel jLjurosTot;
    private javax.swing.JLabel jLjurosTotValor;
    private javax.swing.JLabel jLnasc;
    private javax.swing.JLabel jLnascF;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLnomeF;
    private javax.swing.JLabel jLrg;
    private javax.swing.JLabel jLrgF;
    private javax.swing.JLabel jLtelF;
    private javax.swing.JLabel jLtelefone;
    private javax.swing.JLabel jLtotalC;
    private javax.swing.JLabel jLtotalCQntd;
    private javax.swing.JMenu jMadmin;
    private javax.swing.JMenuBar jMbBarra;
    private javax.swing.JMenu jMiJuros;
    private javax.swing.JPanel jPmain;
    private javax.swing.JPanel jPnCliente;
    private javax.swing.JPanel jPnGerenciamento;
    private javax.swing.JPanel jPnResumo;
    private javax.swing.JPanel jPnVendas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
