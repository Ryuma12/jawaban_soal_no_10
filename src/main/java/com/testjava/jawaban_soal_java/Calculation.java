package com.testjava.jawaban_soal_java;

public class Calculation {

    private int hitung;
    
    public Calculation(int hitung) {
        this.hitung = hitung;
    }
    

    /**
     * @return int return the hitung
     */
    public int getHitung() {
        return hitung;
    }

    /**
     * @param hitung the hitung to set
     */
    public void setHitung(int hitung) {
        this.hitung = hitung;
    }

    public int penjumlahan(){
		int hasil=0;
		for(int i=0;i<=hitung;i++){
			hasil+=i;
		}
		return hasil;
	}

}
