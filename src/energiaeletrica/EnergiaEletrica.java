package energiaeletrica;
public class EnergiaEletrica {
private double consumo, fornecimento, icms, confins, pispasesp, icmscofins, icmspispasesp, fatura;
    public EnergiaEletrica(double consumo) {
        this.setConsumo(consumo);
        this.setFornecimento();
        this.setIcms();
        this.setConfins();
        this.setPispasesp();        
        this.setIcmscofins();
        this.setIcmspispasesp();
        this.setFatura();}
    public double getConsumo() {
        return consumo;}
    public void setConsumo(double consumo) {
        this.consumo = consumo;}
    public double getFornecimento() {
        return fornecimento;
    }
    public void setFornecimento() {

        this.fornecimento = consumo * 0.28172;
    }
    public double getIcms() {
        return icms;
    } 
    public void setIcms() {
            if (this.consumo <= 200)
                this.icms = fornecimento * 0.136363;
            else
                this.icms = fornecimento * 0.333333;
    }
    public double getConfins() {
        return confins;
    }
    public void setConfins() {
        if(this.getConsumo() <=200)
            this.confins = this.getFornecimento() * 0.0614722;
        else
            this.confins = this.getFornecimento() * 0.0730751;
    }
    public double getPispasesp() {
        return pispasesp;
    }
    public void setPispasesp() {
        if (this.getConsumo() <=200)
            this.pispasesp = this.getFornecimento() * 0.013346;
        else
            this.pispasesp = this.getFornecimento() * 0.0158651;
    }
    public double getIcmscofins() {
        return icmscofins;
    }
    public void setIcmscofins() {
        if(this.getConsumo() <=200)
            this.icmscofins = this.getFornecimento() * 0.0614722 * 0.0136363;
        else
            this.icmscofins = this.getFornecimento()* 0.0730751 * 0.333333;
    }
    public double getIcmspispasesp() {
        return icmspispasesp;
    }    
    public void setIcmspispasesp() {
        if(this.getConsumo() <=200)
            this.icmspispasesp = this.getFornecimento() * 0.013346 * 0.0136363;
        else
            this.icmspispasesp = this.getFornecimento() * 0.0158651 * 0.333333;
    }
    public double getFatura() {
        return fatura;
    }
    public void setFatura(){
        this.fatura = fornecimento + icms + confins + pispasesp + icmscofins + icmspispasesp;
    }
}
                
  