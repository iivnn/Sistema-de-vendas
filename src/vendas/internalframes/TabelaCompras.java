
package vendas.internalframes;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import vendas.DAO.CompraDAO;
import vendas.beans.Compra;

public class TabelaCompras extends javax.swing.JInternalFrame {

    public TabelaCompras(String y , String m, String d) {
        initComponents();
        String date = y + "-" + m + "-" + d;
        CompraDAO dao = new CompraDAO();
        List<Compra> compras = new ArrayList<>();
        compras = dao.read(date);
        fillTable(compras);
        
    }

    public TabelaCompras(int id) {
        initComponents();
        CompraDAO dao = new CompraDAO();
        List<Compra> compras = new ArrayList<>();
        compras = dao.read(id);
        fillTable(compras);
        
    }

    public TabelaCompras(int id, boolean none) {
        initComponents();
        CompraDAO dao = new CompraDAO();
        List<Compra> compras = new ArrayList<>();
        compras = dao.read(id, none);
        fillTable(compras);
        
    }
    
    private void fillTable(List<Compra> compras){
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        double total = 0;
        total = compras.stream().map(item -> {
            tb.addRow(new Object[]{
            item.getId(),
            item.getData(),
            item.getCliente().getId(),
            item.getCliente().getNome(),
            item.getProduto().getId(),
            item.getProduto().getNome(),
            item.getProduto().getQnt(),
            item.getProduto().getPreco(),
            item.getProduto().getQnt() * item.getProduto().getPreco()
            });
            return item;
        }).map(item -> item.getProduto().getQnt() * item.getProduto().getPreco()).reduce(total, (accumulator, _item) -> accumulator + _item);
        tb.addRow(new Object[]{null,null,null,null,null,null,null,null, total});
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
        setTitle("Pesquisa de compras");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "ID cliente", "Cliente", "ID produto", "Produto", "Quantidade", "Preço", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
