package app;

public interface Gate {

    /**
     * Metodo para obtener el valor de la entrada 1
     * @return
     */
    int getIn1();

    /**
     * Metodo para obtener el valor de la entrada 2
     * @return entrada - Valor de la entrada
     */
    int getIn2();

    /**
     * Metodo para obtener la salida de la operacion logica
     * @return - Resultado de la operacion logica
     */
    int getOut();

    /**
     * Metodo para establecer el valor de la entrada 1
     * @param In1 - Valor de la entrada
     */
    void setIn1(int In1);

    /**
     * Metodo para establecer el valor de la segunda entrada
     * @param In2 - Valor de la entrada
     */
    void setIn2(int In2);

    /**
     * Metodo para establecer el valor de la salida
     * @param In1
     * @param In2
     */
    void setOut(int In1, int In2);

}