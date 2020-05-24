package solver;

/**
 * 運動方程式を解きます。
 * */
public class Solver {

	/**各ステップの時刻[s]
	 * t0を初期時刻
	 * t[0]を次の時刻での時間とします*/
	private double[] t;

	/**各ステップの位置[m]*/
	private double[] x;

	/**各ステップの速度[m/s]*/
	private double[] v;

	private double mass;

	private Force F;
	private double dt;

	/**
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
	/**mainからもらった値をSolverにセットする
	 * n=2のステップ数の時、n=0,1,2の３つの値が必要になった→n+1
	 * new doubleの後ろは欲しい値の数(ここではステップをn踏むので、n+1になる)
	 *
	 * */

	this.mass = mass;
	this.F = F;
	this.dt = dt;

	this.t = new double[n+1];
	this.t[0] = t0;

	this.x = new double[n+1];
	this.x[0] = x0;

	this.v = new double[n+1];
	this.v[0] = v0;







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
