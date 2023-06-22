import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre;
    }
}

class Vendedor {
    private String nombre;
    public Vendedor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Vendedor: " + nombre;
    }
}

class AgenciaDeViajes {
    private List<Cliente> clientes;
    private List<Vendedor> vendedores;

    public AgenciaDeViajes() {
        clientes = new ArrayList<>();
        vendedores = new ArrayList<>();
    }

    public void añadirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void añadirVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public Cliente buscarCliente(String nombreCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombreCliente)) {
                return cliente;
            }
        }
        return null; // Si no se encuentra el cliente
    }

    public Vendedor buscarVendedor(String nombreVendedor) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getNombre().equalsIgnoreCase(nombreVendedor)) {
                return vendedor;
            }
        }
        return null; // Si no se encuentra el vendedor
    }

    public void eliminarVendedor(Vendedor vendedor) {
        vendedores.remove(vendedor);
    }

    public void generarVenta(Cliente cliente, Vendedor vendedor) {
        // Implementa la lógica para generar una venta
        System.out.println("Se generó una venta para el cliente " + cliente.getNombre() + " con el vendedor " + vendedor.getNombre());
    }
}
