import java.math.BigDecimal;

public class lotti {
	
	private String idlotto;
	private String lotto;
	private String item;
	private BigDecimal qta;
	
	public lotti(String idlotto, String lotto, String item, BigDecimal qta) {
		super();
		this.idlotto = idlotto;
		this.lotto = lotto;
		this.item = item; 
		this.qta = qta;
	}
	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getIdlotto() {
		return idlotto;
	}
	public void setIdlotto(String idlotto) {
		this.idlotto = idlotto;
	}
	public String getLotto() {
		return lotto;
	}
	public void setLotto(String lotto) {
		this.lotto = lotto;
	}
	public BigDecimal getQta() {
		return qta;
	}
	public void setQta(BigDecimal qta) {
		this.qta = qta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idlotto == null) ? 0 : idlotto.hashCode());
		result = prime * result + ((lotto == null) ? 0 : lotto.hashCode());
		result = prime * result + ((qta == null) ? 0 : qta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		lotti other = (lotti) obj;
		if (idlotto == null) {
			if (other.idlotto != null)
				return false;
		} else if (!idlotto.equals(other.idlotto))
			return false;
		if (lotto == null) {
			if (other.lotto != null)
				return false;
		} else if (!lotto.equals(other.lotto))
			return false;
		if (qta == null) {
			if (other.qta != null)
				return false;
		} else if (!qta.equals(other.qta))
			return false;
		return true;
	}
	
	
	
}
