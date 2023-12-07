package util;

public class Cnmop {
	
	private String item;
	private String bolla;
	private String mag;
	private String op;
	private String seq;
	private String aggraf;
	
	public Cnmop(String item, String bolla, String mag, String op, String seq) {
		super();
		this.item = item;
		this.bolla = bolla;
		this.mag = mag;
		this.op = op;
		this.seq = seq;
	}
	
	public Cnmop(String item, String bolla, String mag, String op, String seq, String aggraf) {
		super();
		this.item = item;
		this.bolla = bolla;
		this.mag = mag;
		this.op = op;
		this.seq = seq;
		this.aggraf = aggraf;
	}

	public String getAggraf() {
		return aggraf;
	}

	public void setAggraf(String aggraf) {
		this.aggraf = aggraf;
	}

	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getBolla() {
		return bolla;
	}
	public void setBolla(String bolla) {
		this.bolla = bolla;
	}
	public String getMag() {
		return mag;
	}
	public void setMag(String mag) {
		this.mag = mag;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bolla == null) ? 0 : bolla.hashCode());
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((mag == null) ? 0 : mag.hashCode());
		result = prime * result + ((op == null) ? 0 : op.hashCode());
		result = prime * result + ((seq == null) ? 0 : seq.hashCode());
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
		Cnmop other = (Cnmop) obj;
		if (bolla == null) {
			if (other.bolla != null)
				return false;
		} else if (!bolla.equals(other.bolla))
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (mag == null) {
			if (other.mag != null)
				return false;
		} else if (!mag.equals(other.mag))
			return false;
		if (op == null) {
			if (other.op != null)
				return false;
		} else if (!op.equals(other.op))
			return false;
		if (seq == null) {
			if (other.seq != null)
				return false;
		} else if (!seq.equals(other.seq))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cnmop [item=" + item + ", bolla=" + bolla + ", mag=" + mag + ", op=" + op + ", seq=" + seq + ", aggraf="
				+ aggraf + "]";
	}

	
}
