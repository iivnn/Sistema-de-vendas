package vendas.mainscreen;

import vendas.internalframes.TabelaClientes;
import java.awt.CardLayout;
import java.sql.Date;
import vendas.internalframes.TabelaCompras;
import vendas.internalframes.TabelaProdutos;


public class ScreenMain extends javax.swing.JFrame {

    
    public ScreenMain() {
        initComponents();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1Opcao = new javax.swing.JComboBox<>();
        jPanelLayout = new javax.swing.JPanel();
        jPanelClientes = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jNomeCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jIDCliente = new javax.swing.JFormattedTextField();
        jButtonCliente = new javax.swing.JButton();
        isjCheckBoxId = new javax.swing.JCheckBox();
        isjNomeCliente = new javax.swing.JCheckBox();
        jPanelProdutos = new javax.swing.JPanel();
        jButtonProduto = new javax.swing.JButton();
        qntProduto = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        iDProduto = new javax.swing.JFormattedTextField();
        precoProduto = new javax.swing.JFormattedTextField();
        op2Produto = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        nomeProduto = new javax.swing.JTextField();
        op1Produto = new javax.swing.JComboBox<>();
        isNomeProduto = new javax.swing.JCheckBox();
        isIDProduto = new javax.swing.JCheckBox();
        isQntProduto = new javax.swing.JCheckBox();
        isPrecoProduto = new javax.swing.JCheckBox();
        jPanelVendas = new javax.swing.JPanel();
        iDVendas = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        isIDCliente = new javax.swing.JCheckBox();
        jButtonClientes = new javax.swing.JButton();
        dia = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        iDClienteVenda = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        isIDProdutoCliente = new javax.swing.JCheckBox();
        ano = new javax.swing.JFormattedTextField();
        mes = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jDesktop = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");
        setBackground(new java.awt.Color(102, 102, 102));
        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(61, 61, 61));

        jLabel1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pesquisar por:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Area de pesquisa");

        jComboBox1Opcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clientes", "Produtos", "Vendas" }));
        jComboBox1Opcao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1OpcaoItemStateChanged(evt);
            }
        });

        jPanelLayout.setBackground(new java.awt.Color(61, 61, 61));
        jPanelLayout.setLayout(new java.awt.CardLayout());

        jPanelClientes.setBackground(new java.awt.Color(61, 61, 61));

        jLabel3.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");

        jNomeCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID:");

        jIDCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jIDCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButtonCliente.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCliente.setText("Buscar");
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });

        isjCheckBoxId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        isjNomeCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addComponent(jButtonCliente)
                        .addContainerGap(193, Short.MAX_VALUE))
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNomeCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(jIDCliente, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isjNomeCliente)
                            .addComponent(isjCheckBoxId))
                        .addGap(20, 20, 20))))
        );
        jPanelClientesLayout.setVerticalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isjNomeCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isjCheckBoxId))
                .addGap(18, 18, 18)
                .addComponent(jButtonCliente)
                .addContainerGap(384, Short.MAX_VALUE))
        );

        jPanelLayout.add(jPanelClientes, "Clientes");

        jPanelProdutos.setBackground(new java.awt.Color(61, 61, 61));

        jButtonProduto.setBackground(new java.awt.Color(102, 102, 102));
        jButtonProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonProduto.setText("Buscar");
        jButtonProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutoActionPerformed(evt);
            }
        });

        qntProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        qntProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID:");

        jLabel6.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nome:");

        jLabel7.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantidade:");

        iDProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        iDProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        precoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        precoProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        op2Produto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", ">", "<" }));

        jLabel8.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Preço:");

        nomeProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        op1Produto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", ">", "<" }));

        isNomeProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        isNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isNomeProdutoActionPerformed(evt);
            }
        });

        isIDProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        isIDProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isIDProdutoActionPerformed(evt);
            }
        });

        isQntProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        isQntProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isQntProdutoActionPerformed(evt);
            }
        });

        isPrecoProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        isPrecoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isPrecoProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelProdutosLayout = new javax.swing.GroupLayout(jPanelProdutos);
        jPanelProdutos.setLayout(jPanelProdutosLayout);
        jPanelProdutosLayout.setHorizontalGroup(
            jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProdutosLayout.createSequentialGroup()
                        .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nomeProduto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iDProduto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addGroup(jPanelProdutosLayout.createSequentialGroup()
                                    .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(qntProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(precoProduto))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(op2Produto, 0, 100, Short.MAX_VALUE)
                                        .addComponent(op1Produto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isNomeProduto)
                            .addComponent(isIDProduto)
                            .addComponent(isQntProduto)
                            .addComponent(isPrecoProduto)))
                    .addComponent(jButtonProduto))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanelProdutosLayout.setVerticalGroup(
            jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isNomeProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isIDProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(qntProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(op1Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(isQntProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isPrecoProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(op2Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(precoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonProduto)
                .addContainerGap(264, Short.MAX_VALUE))
        );

        jPanelLayout.add(jPanelProdutos, "Produtos");

        jPanelVendas.setBackground(new java.awt.Color(61, 61, 61));

        iDVendas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        iDVendas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID:");

        isIDCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        isIDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isIDClienteActionPerformed(evt);
            }
        });

        jButtonClientes.setBackground(new java.awt.Color(102, 102, 102));
        jButtonClientes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonClientes.setText("Buscar");
        jButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesActionPerformed(evt);
            }
        });

        dia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd"))));
        dia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Data dia / mes / ano:");

        iDClienteVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        iDClienteVenda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ID do Cliente:");

        isIDProdutoCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        isIDProdutoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isIDProdutoClienteActionPerformed(evt);
            }
        });

        ano.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy"))));
        ano.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        mes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM"))));
        mes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel10.setText("/");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel13.setText("/");

        javax.swing.GroupLayout jPanelVendasLayout = new javax.swing.GroupLayout(jPanelVendas);
        jPanelVendas.setLayout(jPanelVendasLayout);
        jPanelVendasLayout.setHorizontalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVendasLayout.createSequentialGroup()
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanelVendasLayout.createSequentialGroup()
                                .addComponent(iDVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(isIDCliente))
                            .addGroup(jPanelVendasLayout.createSequentialGroup()
                                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelVendasLayout.createSequentialGroup()
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanelVendasLayout.createSequentialGroup()
                                .addComponent(iDClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(isIDProdutoCliente))
                            .addComponent(jButtonClientes)
                            .addComponent(jLabel11))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanelVendasLayout.setVerticalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iDVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isIDCliente))
                .addGap(12, 12, 12)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iDClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isIDProdutoCliente))
                .addGap(18, 18, 18)
                .addComponent(jButtonClientes)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        jPanelLayout.add(jPanelVendas, "Vendas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1Opcao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1Opcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jPanelLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jDesktop.setBackground(new java.awt.Color(61, 61, 61));

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 939, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenuBar2.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar2.setBorder(null);
        jMenuBar2.setForeground(new java.awt.Color(255, 102, 102));

        jMenu1.setText("Cliente");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setText("Novo");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem2.setText("Excluir");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem3.setText("Atualizar");
        jMenu1.add(jMenuItem3);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Produto");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBar2.add(jMenu2);

        jMenu5.setText("Venda");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1264, 809));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1OpcaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1OpcaoItemStateChanged
        CardLayout cl =  (CardLayout) jPanelLayout.getLayout();
        cl.show(jPanelLayout, jComboBox1Opcao.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBox1OpcaoItemStateChanged

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        String pNome = null, pId = null;
        if(isjNomeCliente.isSelected()){pNome = jNomeCliente.getText().toUpperCase().trim();}
        if(isjCheckBoxId.isSelected()){pId = jIDCliente.getText().trim();}
        TabelaClientes tb = new TabelaClientes(pNome, pId);
        jDesktop.add(tb);
        tb.setVisible(true);
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jButtonProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutoActionPerformed
        TabelaProdutos tb;
        if(isIDProduto.isSelected()){ 
            tb = new TabelaProdutos(Integer.parseInt(iDProduto.getText()));
        }else if(isNomeProduto.isSelected() && isQntProduto.isSelected() && isPrecoProduto.isSelected()){
            tb = new TabelaProdutos(
                    nomeProduto.getText().trim(),
                    Integer.parseInt(qntProduto.getText()),
                    Double.parseDouble(precoProduto.getText()),
                    op1Produto.getSelectedItem().toString().toCharArray()[0],
                    op2Produto.getSelectedItem().toString().toCharArray()[0]
            );
        }else if(isNomeProduto.isSelected() && isQntProduto.isSelected()){
            tb = new TabelaProdutos(
                    nomeProduto.getText().trim(),
                    Integer.parseInt(qntProduto.getText()),
                    op1Produto.getSelectedItem().toString().toCharArray()[0]
            );
        }else if(isNomeProduto.isSelected() && isPrecoProduto.isSelected()){
            tb = new TabelaProdutos(
                    nomeProduto.getText().trim(),
                    Double.parseDouble(precoProduto.getText()),
                    op2Produto.getSelectedItem().toString().toCharArray()[0]
            );
        }else if(isQntProduto.isSelected() && isPrecoProduto.isSelected()){
            tb = new TabelaProdutos(
                    Integer.parseInt(qntProduto.getText()),
                    Double.parseDouble(precoProduto.getText()),
                    op1Produto.getSelectedItem().toString().toCharArray()[0],
                    op2Produto.getSelectedItem().toString().toCharArray()[0]
            );
        }else if(isNomeProduto.isSelected()){
            tb = new TabelaProdutos(
                    nomeProduto.getText().trim()
            );
        }else if(isQntProduto.isSelected()){
            tb = new TabelaProdutos(
                    Integer.parseInt(qntProduto.getText()),
                    op1Produto.getSelectedItem().toString().toCharArray()[0]
            );
        }else if(isPrecoProduto.isSelected()){
            tb = new TabelaProdutos(
                    Double.parseDouble(precoProduto.getText()),
                    op2Produto.getSelectedItem().toString().toCharArray()[0]
            );
        }else{
            tb = new TabelaProdutos();
        }
        jDesktop.add(tb);
        tb.setVisible(true);
    }//GEN-LAST:event_jButtonProdutoActionPerformed

    private void isIDProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isIDProdutoActionPerformed
        // TODO add your handling code here:
        if(isIDProduto.isSelected()){
            isNomeProduto.setSelected(false);
            isQntProduto.setSelected(false);
            isPrecoProduto.setSelected(false);
        }
    }//GEN-LAST:event_isIDProdutoActionPerformed

    private void isNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isNomeProdutoActionPerformed
       unselectID();
    }//GEN-LAST:event_isNomeProdutoActionPerformed

    private void isQntProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isQntProdutoActionPerformed
        unselectID();
    }//GEN-LAST:event_isQntProdutoActionPerformed

    private void isPrecoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isPrecoProdutoActionPerformed
        unselectID();
    }//GEN-LAST:event_isPrecoProdutoActionPerformed

    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesActionPerformed
        if(isIDCliente.isSelected()){
            TabelaCompras tb = new TabelaCompras(Integer.parseInt(iDVendas.getText()));
            jDesktop.add(tb);
            tb.setVisible(true); 
        }else if(isIDProdutoCliente.isSelected()){
            TabelaCompras tb = new TabelaCompras(Integer.parseInt(iDClienteVenda.getText()), true);
            jDesktop.add(tb);
            tb.setVisible(true); 
        }else{
           TabelaCompras tb = new TabelaCompras(ano.getText(), mes.getText(), dia.getText());
            jDesktop.add(tb);
            tb.setVisible(true); 
        }
        
        
    }//GEN-LAST:event_jButtonClientesActionPerformed

    private void isIDClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isIDClienteActionPerformed
        if(isIDProdutoCliente.isSelected()){
            isIDProdutoCliente.setSelected(false);
        }
        
    }//GEN-LAST:event_isIDClienteActionPerformed

    private void isIDProdutoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isIDProdutoClienteActionPerformed
        if(isIDCliente.isSelected()){
            isIDCliente.setSelected(false);
        }
    }//GEN-LAST:event_isIDProdutoClienteActionPerformed
    
    private void unselectID(){
        if(isIDProduto.isSelected()){
           isIDProduto.setSelected(false);
        }
    }
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
            java.util.logging.Logger.getLogger(ScreenMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenMain().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ano;
    private javax.swing.JFormattedTextField dia;
    private javax.swing.JFormattedTextField iDClienteVenda;
    private javax.swing.JFormattedTextField iDProduto;
    private javax.swing.JFormattedTextField iDVendas;
    private javax.swing.JCheckBox isIDCliente;
    private javax.swing.JCheckBox isIDProduto;
    private javax.swing.JCheckBox isIDProdutoCliente;
    private javax.swing.JCheckBox isNomeProduto;
    private javax.swing.JCheckBox isPrecoProduto;
    private javax.swing.JCheckBox isQntProduto;
    private javax.swing.JCheckBox isjCheckBoxId;
    private javax.swing.JCheckBox isjNomeCliente;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonProduto;
    private javax.swing.JComboBox<String> jComboBox1Opcao;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JFormattedTextField jIDCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JTextField jNomeCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelClientes;
    private javax.swing.JPanel jPanelLayout;
    private javax.swing.JPanel jPanelProdutos;
    private javax.swing.JPanel jPanelVendas;
    private javax.swing.JFormattedTextField mes;
    private javax.swing.JTextField nomeProduto;
    private javax.swing.JComboBox<String> op1Produto;
    private javax.swing.JComboBox<String> op2Produto;
    private javax.swing.JFormattedTextField precoProduto;
    private javax.swing.JFormattedTextField qntProduto;
    // End of variables declaration//GEN-END:variables
}
