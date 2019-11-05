/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.JurosDAO;
import dao.VendaDAO;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import util.DateChecker;
/**
 *
 * @author USER
 */
public class Pagamento extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public Pagamento() {
        initComponents();
        jTcpf.setText(Main.cliente.getCPF());
        jTnome.setText(Main.cliente.getNome());
        jTrg.setText(Main.cliente.getRG());
        jTemAberto.setText(VendaDAO.pegarAbertos(Main.cliente)+"");
        jTvencidas.setText(VendaDAO.pegarQntdVencidas(Main.cliente)+"");
        jTvalorAberto.setText(VendaDAO.pegarValorAberto(Main.cliente)+"");
        jTvalorTotal.setText(VendaDAO.pegarTotal(Main.cliente)+"");
        jTtotVencido.setText(VendaDAO.pegarValorVencido(Main.cliente)+"");
        jTvalJuros.setText(JurosDAO.calcularJurosTotal(Main.cliente)+"");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnPrincipal = new javax.swing.JPanel();
        jLtitle = new javax.swing.JLabel();
        jPnDados = new javax.swing.JPanel();
        jLnome = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jLCPF = new javax.swing.JLabel();
        jTcpf = new javax.swing.JTextField();
        jLRG = new javax.swing.JLabel();
        jTrg = new javax.swing.JTextField();
        jPnCompras = new javax.swing.JPanel();
        jLCEmAberto = new javax.swing.JLabel();
        jTemAberto = new javax.swing.JTextField();
        jTvencidas = new javax.swing.JTextField();
        jLCVencidas = new javax.swing.JLabel();
        jPnFinanceiro = new javax.swing.JPanel();
        jLVEmAberto = new javax.swing.JLabel();
        jTvalorAberto = new javax.swing.JTextField();
        jTtotVencido = new javax.swing.JTextField();
        jLtotVencido = new javax.swing.JLabel();
        jLVTotal = new javax.swing.JLabel();
        jTvalorTotal = new javax.swing.JTextField();
        jTvalJuros = new javax.swing.JTextField();
        jLvalJuros = new javax.swing.JLabel();
        jPnPagamento = new javax.swing.JPanel();
        jLvalorPgmnto = new javax.swing.JLabel();
        jTvalorPgmnto = new javax.swing.JTextField();
        jLparcelasPgmnto = new javax.swing.JLabel();
        jTparcelasPgmnto = new javax.swing.JTextField();
        jLvencimento = new javax.swing.JLabel();
        jFTvencimento = new javax.swing.JFormattedTextField();
        jCBJuros = new javax.swing.JCheckBox();
        jCBTodas = new javax.swing.JCheckBox();
        jBpagamento = new javax.swing.JButton();

        setTitle("Registro de Vendas");

        jPnPrincipal.setBackground(new java.awt.Color(56, 56, 56));

        jLtitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLtitle.setText("TryFatus");
        jLtitle.setForeground(new Color(187,187,187));

        jPnDados.setBackground(new java.awt.Color(56, 56, 56));
        jPnDados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new Font("Times New Roman", 1, 14), new Color(187,187,187)));
        jPnDados.setForeground(new java.awt.Color(56, 56, 56));
        jPnDados.setToolTipText("");

        jLnome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLnome.setForeground(new Color(187,187,187));
        jLnome.setText("Nome:");

        jTnome.setEditable(false);
        jTnome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTnome.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTnome.setBackground(new Color(69,73,74));
        jTnome.setForeground(new Color(187, 187, 187));

        jLCPF.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLCPF.setForeground(new Color(187,187,187));
        jLCPF.setText("CPF:");

        jTcpf.setEditable(false);
        jTcpf.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTcpf.setBackground(new Color(69,73,74));
        jTcpf.setForeground(new Color(187, 187, 187));

        jLRG.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLRG.setForeground(new Color(187,187,187));
        jLRG.setText("RG:");

        jTrg.setEditable(false);
        jTrg.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTrg.setBackground(new Color(69,73,74));
        jTrg.setForeground(new Color(187, 187, 187));

        javax.swing.GroupLayout jPnDadosLayout = new javax.swing.GroupLayout(jPnDados);
        jPnDados.setLayout(jPnDadosLayout);
        jPnDadosLayout.setHorizontalGroup(
            jPnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLnome)
                    .addComponent(jLCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPnDadosLayout.createSequentialGroup()
                        .addComponent(jTcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTrg))
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        jPnDadosLayout.setVerticalGroup(
            jPnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnome)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLRG, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLCPF)
                        .addComponent(jTcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPnCompras.setBackground(new java.awt.Color(56, 56, 56));
        jPnCompras.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados de Compras", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new Font("Times New Roman", 1, 14), new Color(187,187,187)));
        jPnCompras.setForeground(new java.awt.Color(56, 56, 56));
        jPnCompras.setToolTipText("");

        jLCEmAberto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLCEmAberto.setForeground(new Color(187,187,187));
        jLCEmAberto.setText("Em Aberto:");

        jTemAberto.setEditable(false);
        jTemAberto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTemAberto.setText("0");
        jTemAberto.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTemAberto.setBackground(new Color(69,73,74));
        jTemAberto.setForeground(new Color(187, 187, 187));

        jTvencidas.setEditable(false);
        jTvencidas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTvencidas.setText("0");
        jTvencidas.setBackground(new Color(69,73,74));
        jTvencidas.setForeground(new Color(187, 187, 187));

        jLCVencidas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLCVencidas.setForeground(new Color(187,187,187));
        jLCVencidas.setText("Vencidas:");

        javax.swing.GroupLayout jPnComprasLayout = new javax.swing.GroupLayout(jPnCompras);
        jPnCompras.setLayout(jPnComprasLayout);
        jPnComprasLayout.setHorizontalGroup(
            jPnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCEmAberto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTemAberto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLCVencidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTvencidas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPnComprasLayout.setVerticalGroup(
            jPnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTemAberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCEmAberto)
                    .addComponent(jLCVencidas)
                    .addComponent(jTvencidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPnFinanceiro.setBackground(new java.awt.Color(56, 56, 56));
        jPnFinanceiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Financeiros", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new Font("Times New Roman", 1, 14), new Color(187,187,187)));
        jPnFinanceiro.setForeground(new java.awt.Color(56, 56, 56));
        jPnFinanceiro.setToolTipText("");

        jLVEmAberto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLVEmAberto.setForeground(new Color(187,187,187));
        jLVEmAberto.setText("Em Aberto:");

        jTvalorAberto.setEditable(false);
        jTvalorAberto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTvalorAberto.setText("0.00");
        jTvalorAberto.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTvalorAberto.setBackground(new Color(69,73,74));
        jTvalorAberto.setForeground(new Color(187, 187, 187));

        jTtotVencido.setEditable(false);
        jTtotVencido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTtotVencido.setText("0.00");
        jTtotVencido.setBackground(new Color(69,73,74));
        jTtotVencido.setForeground(new Color(187, 187, 187));

        jLtotVencido.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLtotVencido.setForeground(new Color(187,187,187));
        jLtotVencido.setText("Vencido:");

        jLVTotal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLVTotal.setForeground(new Color(187,187,187));
        jLVTotal.setText("Total:");

        jTvalorTotal.setEditable(false);
        jTvalorTotal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTvalorTotal.setText("0.00");
        jTvalorTotal.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTvalorTotal.setBackground(new Color(69,73,74));
        jTvalorTotal.setForeground(new Color(187, 187, 187));

        jTvalJuros.setEditable(false);
        jTvalJuros.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTvalJuros.setText("0.00");
        jTvalJuros.setBackground(new Color(69,73,74));
        jTvalJuros.setForeground(new Color(187, 187, 187));

        jLvalJuros.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLvalJuros.setForeground(new Color(187,187,187));
        jLvalJuros.setText("Juros:");

        javax.swing.GroupLayout jPnFinanceiroLayout = new javax.swing.GroupLayout(jPnFinanceiro);
        jPnFinanceiro.setLayout(jPnFinanceiroLayout);
        jPnFinanceiroLayout.setHorizontalGroup(
            jPnFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFinanceiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnFinanceiroLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLtotVencido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTtotVencido, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLvalJuros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTvalJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnFinanceiroLayout.createSequentialGroup()
                        .addComponent(jLVTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTvalorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLVEmAberto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTvalorAberto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnFinanceiroLayout.setVerticalGroup(
            jPnFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFinanceiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLVTotal)
                    .addComponent(jTvalorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTvalorAberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLVEmAberto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTvalJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLvalJuros))
                    .addGroup(jPnFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTtotVencido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLtotVencido)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPnPagamento.setBackground(new java.awt.Color(56, 56, 56));
        jPnPagamento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pagamento", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new Font("Times New Roman", 1, 14), new Color(187,187,187)));

        jLvalorPgmnto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLvalorPgmnto.setForeground(new Color(187,187,187));
        jLvalorPgmnto.setText("Valor:");

        jTvalorPgmnto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTvalorPgmnto.setText("0.00");
        jTvalorPgmnto.setBackground(new Color(69,73,74));
        jTvalorPgmnto.setForeground(new Color(187, 187, 187));

        jLparcelasPgmnto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLparcelasPgmnto.setForeground(new Color(187,187,187));
        jLparcelasPgmnto.setText("Parcelas:");

        jTparcelasPgmnto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTparcelasPgmnto.setText("1");
        jTparcelasPgmnto.setBackground(new Color(69,73,74));
        jTparcelasPgmnto.setForeground(new Color(187, 187, 187));

        jLvencimento.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLvencimento.setForeground(new Color(187,187,187));
        jLvencimento.setText("Novo Vencimento:");

        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");
            jFTvencimento = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }

        jFTvencimento.setFont(new java.awt.Font("Times New Roman", 0, 14));

        jFTvencimento.setBackground(new Color(69,73,74));

        jFTvencimento.setForeground(new Color(187,187,187));

        jCBJuros.setSelected(true);
        jCBJuros.setText("Cobrar Juros");
        jCBJuros.setForeground(new Color(187,187,187));

        jCBTodas.setSelected(true);
        jCBTodas.setText("Contar para todas");
        jCBTodas.setForeground(new Color(187,187,187));

        javax.swing.GroupLayout jPnPagamentoLayout = new javax.swing.GroupLayout(jPnPagamento);
        jPnPagamento.setLayout(jPnPagamentoLayout);
        jPnPagamentoLayout.setHorizontalGroup(
            jPnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnPagamentoLayout.createSequentialGroup()
                        .addComponent(jLvalorPgmnto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTvalorPgmnto, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLparcelasPgmnto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTparcelasPgmnto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPnPagamentoLayout.createSequentialGroup()
                        .addGroup(jPnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnPagamentoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jCBJuros)
                                .addGap(18, 18, 18)
                                .addComponent(jCBTodas))
                            .addGroup(jPnPagamentoLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLvencimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTvencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPnPagamentoLayout.setVerticalGroup(
            jPnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnPagamentoLayout.createSequentialGroup()
                .addGroup(jPnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLvalorPgmnto)
                    .addComponent(jTvalorPgmnto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLparcelasPgmnto)
                    .addComponent(jTparcelasPgmnto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLvencimento)
                    .addComponent(jFTvencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBJuros)
                    .addComponent(jCBTodas)))
        );

        jBpagamento.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jBpagamento.setText("Registrar Pagamento");
        jBpagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpagamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnPrincipalLayout = new javax.swing.GroupLayout(jPnPrincipal);
        jPnPrincipal.setLayout(jPnPrincipalLayout);
        jPnPrincipalLayout.setHorizontalGroup(
            jPnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnPrincipalLayout.createSequentialGroup()
                .addGroup(jPnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPnFinanceiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPnCompras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPnDados, javax.swing.GroupLayout.PREFERRED_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jPnPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPnPrincipalLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLtitle)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBpagamento)
                .addGap(53, 53, 53))
        );
        jPnPrincipalLayout.setVerticalGroup(
            jPnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPnDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBpagamento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBpagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpagamentoActionPerformed
        if (jTparcelasPgmnto.getText().isEmpty() || jFTvencimento.getText().isEmpty() || jTvalorPgmnto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Quantia de parcelas, valor e vencimento não podem estar vazios!");
        } else {
            VendaDAO.updateVendas((Double.parseDouble(jTvalorPgmnto.getText())), Main.cliente, Integer.parseInt(jTparcelasPgmnto.getText()), DateChecker.DateChecker(jFTvencimento.getText()), jCBJuros.isSelected(), jCBTodas.isSelected());
            JOptionPane.showMessageDialog(null, "Pagamento confirmado!");
            jTparcelasPgmnto.setText("");
            jTvalorPgmnto.setText("0.00");
            jFTvencimento.setText("");
        }
    }//GEN-LAST:event_jBpagamentoActionPerformed
    
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
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBpagamento;
    private javax.swing.JCheckBox jCBJuros;
    private javax.swing.JCheckBox jCBTodas;
    private javax.swing.JFormattedTextField jFTvencimento;
    private javax.swing.JLabel jLCEmAberto;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCVencidas;
    private javax.swing.JLabel jLRG;
    private javax.swing.JLabel jLVEmAberto;
    private javax.swing.JLabel jLVTotal;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLparcelasPgmnto;
    private javax.swing.JLabel jLtitle;
    private javax.swing.JLabel jLtotVencido;
    private javax.swing.JLabel jLvalJuros;
    private javax.swing.JLabel jLvalorPgmnto;
    private javax.swing.JLabel jLvencimento;
    private javax.swing.JPanel jPnCompras;
    private javax.swing.JPanel jPnDados;
    private javax.swing.JPanel jPnFinanceiro;
    private javax.swing.JPanel jPnPagamento;
    private javax.swing.JPanel jPnPrincipal;
    private javax.swing.JTextField jTcpf;
    private javax.swing.JTextField jTemAberto;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTparcelasPgmnto;
    private javax.swing.JTextField jTrg;
    private javax.swing.JTextField jTtotVencido;
    private javax.swing.JTextField jTvalJuros;
    private javax.swing.JTextField jTvalorAberto;
    private javax.swing.JTextField jTvalorPgmnto;
    private javax.swing.JTextField jTvalorTotal;
    private javax.swing.JTextField jTvencidas;
    // End of variables declaration//GEN-END:variables
}
