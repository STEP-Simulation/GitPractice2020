package solver;

/**
 * 力を表すクラスです。
 * */
public class Force {

	/**時間[s]の配列*/
	private double[] t;

	/**力[N]の配列*/
	private double[] F;

	private double f;
	private int n;
	private double[] t_array;
	private double[] F_array;

	/**
	 * 時間依存する力のオブジェクトを生成します。
	 * @param t_array 時刻[s]の配列
	 * @param F_array 時刻tにおける力[N]
	 * */
	public Force(double[] t_array, double[] F_array) {
		n = t_array.length;
		t = new double[n + 1];
		F = new double[n + 1];
		this.t_array = t_array;
		//System.out.println(Arrays.toString(t_array));
		this.F_array = F_array;

	}

	/**
	 * 時刻t[s]における力[N]を返します。
	 * 値は線形補間により計算したものです。
	 * 指定した時間が範囲外であった場合、0が返されます。
	 * @param t 時刻t[s]
	 * @return f 時刻t[s]における力[N]
	 * */
	public double value(double t) {
		//System.out.println("kitayo!");
		//System.out.println("t=");
		//System.out.println(t);
		if(t >= t_array[0] && t <= t_array[n-1]) {
			//System.out.println("here");
			for(int i = 0; i < n; i++) {
				if(t < t_array[i]) {
					//System.out.println("aaaaaaaa");
					//System.out.println(F_array[i-1]);
					//System.out.println(F_array[i]);
					f = F_array[i-1] + (F_array[i] - F_array[i-1]) * (t - t_array[i-1]) / ((t_array[i]) - t_array[i-1]);
					//System.out.println("f =");
					//System.out.println(f);
				}
			}
			if(t >= t_array[n-1]) {
				f = F_array[n-1];
			}
		}
		else {
			f = 0;
		}

		return f;

	}

}
