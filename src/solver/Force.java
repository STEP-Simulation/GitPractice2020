package solver;

/**
 * 力を表すクラスです。
 * */
public class Force {

	/**時間[s]の配列*/
	private double[] t;

	/**力[N]の配列*/
	private double[] F;

	/**
	 * 時間依存する力のオブジェクトを生成します。
	 * @param t_array 時刻[s]の配列
	 * @param F_array 時刻tにおける力[N]
	 * */
	public Force(double[] t_array, double[] F_array) {

	}

	/**
	 * 時刻t[s]における力[N]を返します。
	 * 値は線形補間により計算したものです。
	 * 指定した時間が範囲外であった場合、0が返されます。
	 * @param t 時刻t[s]
	 * @return 時刻t[s]における力[N]
	 * */
	public double value(double t) {

	}

}
