/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afraid.poison.db2php;

import java.io.File;
import javax.swing.JPanel;
import org.openide.WizardDescriptor;

public final class PhpClassUtilityVisualPanel1 extends JPanel {

	private WizardDescriptor wizard;

	/** Creates new form PhpClassUtilityVisualPanel1 */
	public PhpClassUtilityVisualPanel1(WizardDescriptor wizard) {
		initComponents();
		setWizard(wizard);
	}

	@Override
	public String getName() {
		return "Step #1";
	}

	/**
	 * @return the wizard
	 */
	public WizardDescriptor getWizard() {
		return wizard;
	}

	/**
	 * @param wizard the wizard to set
	 */
	public void setWizard(WizardDescriptor wizard) {
		this.wizard=wizard;
		getFileSelectionPanel().setWizard(wizard);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dfc = new javax.swing.JCheckBox();
        simpleDatabaseInterface = new javax.swing.JCheckBox();
        fileSelectionPanel = new org.afraid.poison.db2php.FileSelectionPanel();

        dfc.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(dfc, org.openide.util.NbBundle.getMessage(PhpClassUtilityVisualPanel1.class, "PhpClassUtilityVisualPanel1.dfc.text")); // NOI18N

        simpleDatabaseInterface.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(simpleDatabaseInterface, org.openide.util.NbBundle.getMessage(PhpClassUtilityVisualPanel1.class, "PhpClassUtilityVisualPanel1.simpleDatabaseInterface.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileSelectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(dfc)
                    .addComponent(simpleDatabaseInterface))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dfc)
                .addGap(18, 18, 18)
                .addComponent(simpleDatabaseInterface)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(fileSelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox dfc;
    private org.afraid.poison.db2php.FileSelectionPanel fileSelectionPanel;
    private javax.swing.JCheckBox simpleDatabaseInterface;
    // End of variables declaration//GEN-END:variables

	/**
	 * @return the directory
	 */
	public File getDirectory() {
		return getFileSelectionPanel().getDirectory();
	}

	/**
	 * @return the dfc
	 */
	public boolean isSetDfc() {
		return dfc.isSelected();
	}

	/**
	 * @return the simpleDatabaseInterface
	 */
	public boolean isSetSimpleDatabaseInterface() {
		return simpleDatabaseInterface.isSelected();
	}

	/**
	 * @return the fileSelectionPanel
	 */
	private FileSelectionPanel getFileSelectionPanel() {
		return fileSelectionPanel;
	}
}

