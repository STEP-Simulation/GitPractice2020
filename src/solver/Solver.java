package solver;

/**
 * 運動方程式を解きます。
 * */
public class Solver {

	/**各ステップの時刻[s]*/
	private double[] t;

	/**各ステップの位置[m]*/
	private double[] x;

	/**各ステップの速度[m/s]*/
	private double[] v;

	/**
	 * 運動方程式を解くSolverオブジェクトを生成します。
	 * @param t0 初期時刻[s]
	 * @param x0 初期位置[m]
	 * @param v0 初期速度[m/s]
 	 * @param mass 質量[kg]
	 * @param F 力[N](時間依存)
	 * @param dt 時間刻み幅[s]
	 * @param n ステップ数(初期段階を0とする)
	 * */
	public Solver(double t0, double x0, double v0, double mass, Force F, double dt, int n) {

	}

	/**
	 * コンストラクタで指定された条件に従って運動方程式を解きます。
	 * 結果はSolverが内部にもつ配列に保存されます。
	 * 取得のためには{@link #give_t_array()}、{@link #give_x_array()}、{@link #give_v_array()}
	 * を利用してください。
	 * */
	public void solve() {

	}

	/**
	 * 解析の結果得られた各ステップにおける時刻を配列にして返します。
	 * @return 各ステップにおける時刻の配列
	 * */
	public double[] give_t_array() {

	}

	/**
	 * 解析の結果得られた各ステップにおける位置を配列にして返します。
	 * @return 各ステップにおける位置の配列
	 * */
	public double[] give_x_array() {

	}

	/**
	 * 解析の結果得られた各ステップにおける速度を配列にして返します。
	 * @return 各ステップにおける速度の配列
	 * */
	public double[] give_v_array() {

	}


}
