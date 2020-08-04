package vendas.internalframes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import vendas.DAO.ProdutoDAO;
import vendas.beans.Produto;


public class TabelaProdutos extends javax.swing.JInternalFrame {
    List<Produto> list = new ArrayList<>();
    ProdutoDAO dao = new ProdutoDAO();
    
        
    public TabelaProdutos(){
        initComponents();
        list = dao.read();
        addRows(list);
    }//todos
    
        
    public TabelaProdutos(int id){
        initComponents();
        list = dao.read(id);
        addRows(list);
    }//id
    
        
    public TabelaProdutos(String nome){
        initComponents();
        list = dao.read(nome);
        addRows(list);
    }//nome
    
        
    public TabelaProdutos(int qnt, char op){
        initComponents();
        list = dao.read(qnt, op);
        addRows(list);
    }//quantidade
    
        
    public TabelaProdutos(double preco, char op){
        initComponents();
        list = dao.read(preco, op);
        addRows(list);
    }//preço
    
        
    public TabelaProdutos(String nome, int qnt, char op){//nome + qnt
        initComponents();
        list = dao.read(nome, qnt, op);
        addRows(list);
    } // nome + quantidade  
        
    
    public TabelaProdutos(String nome, double preco, char op){//nome + preço
        initComponents();
        list = dao.read(nome, preco, op);
        addRows(list);
    }// nome + preço
    
        
    public TabelaProdutos(int qnt, double preco, char op, char op2){//nome + preço
        initComponents();
        list = dao.read(qnt, preco, op, op2);
        addRows(list);
    }// preço + quantidade
    
        
    public TabelaProdutos(String nome, int qnt, double preco, char op, char op2){
        initComponents();
        list = dao.read(nome, qnt, op, preco, op2);
        addRows(list);
    }//nome + quantidade + preço
    
    
    private void addRows(List<Produto> list){
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        list.forEach(item -> {
            tb.addRow(new Object[]{
                item.getId(),
                item.getNome(),
                item.getQnt(),
                item.getPreco()
            });
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pesquisa de produtos");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
