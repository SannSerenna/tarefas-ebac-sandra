package com.example.cadastrocliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroClienteGUI extends JFrame {
    private CadastroCliente cadastro;
    private JTextArea textArea;
    private JTextField nomeField;
    private JTextField emailField;
    private JTextField telefoneField;

    public CadastroClienteGUI() {
        cadastro = new CadastroCliente();
        configurarJanela();
        criarInterface();
    }

    private void configurarJanela() {
        setTitle("Cadastro de Clientes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
    }

    private void criarInterface() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();

        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneField = new JTextField();

        JButton adicionarButton = new JButton("Adicionar Cliente");
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarCliente();
            }
        });

        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(telefoneLabel);
        panel.add(telefoneField);
        panel.add(adicionarButton);

        textArea = new JTextArea();
        textArea.setEditable(false);

        JButton listarButton = new JButton("Listar Clientes");
        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarClientes();
            }
        });

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(listarButton, BorderLayout.SOUTH);
    }

    private void adicionarCliente() {
        String nome = nomeField.getText();
        String email = emailField.getText();
        String telefone = telefoneField.getText();

        if (!cadastro.validarEmail(email)) {
            JOptionPane.showMessageDialog(this, "Email inválido. Deve conter '@'.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!cadastro.validarTelefone(telefone)) {
            JOptionPane.showMessageDialog(this, "Telefone inválido. Deve conter 10 ou 11 dígitos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Cliente cliente = new Cliente(nome, email, telefone);
        cadastro.adicionarCliente(cliente);
        JOptionPane.showMessageDialog(this, "Cliente adicionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        nomeField.setText("");
        emailField.setText("");
        telefoneField.setText("");
    }

    private void listarClientes() {
        StringBuilder sb = new StringBuilder();
        for (Cliente cliente : cadastro.getClientes()) {
            sb.append(cliente).append("\n");
        }
        textArea.setText(sb.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CadastroClienteGUI().setVisible(true);
        });
    }
}
