package main;

import io.ResultPrinter;
import solver.Force;
import solver.Solver;

public class Main {

	/**
	 *メインメソッド
	 **/


	public static void main(String[] args) {
		//パラメータ設定
		double[] t_array = new double[] {
				0, 1, 2, 3, 4
		};
		double[] F_array = new double[] {
				10, 15, 13, 11, 8
		};
		double mass = 5; //5[kg]
		double x0 = 0; //0[m]
		double v0 = 10; //10[m/s]
		double t0 = 0; //0[s]
		double dt = 1e-3; //1e-3[s]
		int n = 10000; //i=0,1,2,...,10000

		//力のオブジェクト生成
		Force F = new Force(t_array,F_array);

		//Solver生成及び計算
		Solver solver = new Solver(t0, x0, v0, mass, F, dt, n);
		solver.solve();

		//計算結果取得
		double[] result_t_array = solver.give_t_array();
		double[] result_x_array = solver.give_x_array();
		double[] result_v_array = solver.give_v_array();

		//結果表示オブジェクトの生成及び結果の表示
		ResultPrinter printer = new ResultPrinter();
		printer.printResult(result_t_array, result_x_array, result_v_array);
	}

}
