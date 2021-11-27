/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.distribuidora.businessImp;

import cl.duoc.pgy2121.distribuidora.business.DistribuidoraBusiness;

/**
 *
 * @author JP
 */
public class DistribuidoraBusinessImp implements DistribuidoraBusiness {

    @Override
    public int ObtenerIva(double precio) {
        double precioIva = precio * 0.19;
        return (int) precioIva; 
                
    }

    @Override
    public int DctoVino(int precio) {
        
        return 0;
    }

    @Override
    public int DctoBebida(int dctoBebida) {
        
        return 0;
    }
    
    
}
