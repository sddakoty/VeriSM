package de.verism.client.validation.rules.input;

import java.util.Arrays;
import java.util.List;

import de.verism.client.validation.rules.BaseValidationRule;


/**
 * Strategy to validate the name field against valid java variable names.
 * Because the names of the inputs will be mapped to variable names on verilog conversation.
 * 
 * @author Daniel Kotyk
 *
 */
public class KeywordRule extends BaseValidationRule<String> {
	
	/**
	 * The reserved words of Verilog HDL as "Verilog-A Language Reference Manual - VHDL International (VI)".
	 */
	private static List<String> keywords = Arrays.asList(
			"abs", "abstol", "access", "acos", "acosh", "ac_stim", "always", "analog", "analysis", "and", "asin", "asinh", "assign", "atan", "atan2", "atanh", 
			"begin", "bound_step", "branch", "buf", "bufif0", "bufif1", 
			"case", "casex", "casez", "cmos", "cos", "cosh", "cross", 
			"ddt", "ddt_nature", "deassign", "default", "defparam", "delay", "disable", "discipline", "discontinuity", 
			"edge", "else", "end", "enddiscipline", "endcase", "endmodule", "endfunction", "endnature", "endprimitive", "endspecify", "endtable", "endtask", "event", "exclude", "exp", 
			"final_step", "flicker_noise", "flow", "for", "force", "forever", "fork", "from", "function", 
			"generate", "ground", 
			"highz0", "highz1", "hypot", 
			"idt", "idt_nature", "if", "ifnone", "inf", "initial", "initial_step", "inout", "input", "integer", 
			"join", 
			"laplace_nd", "laplace_np", "laplace_zd", "laplace_zp", "large", "last_crossing", "ln", "log", 
			"macromodule", "max", "medium", "min", "module", 
			"nand", "nature", "negedge", "nmos", "noise_table", "nor", "not", "notif0", "notif1", 
			"or", "output", 
			"parameter", "pmos", "posedge", "potential", "pow", "primitive", "pull0", "pull1", "pullup", "pulldown", 
			"rcmos", "real", "realtime", "reg", "release", "repeat", "rnmos", "rpmos", "rtran", "rtranif0", "rtranif1", 
			"scalared", "sin", "sinh", "slew", "small", "specify", "specparam", "sqrt", "strong0", "strong1", "supply0", "supply1", 
			"table", "tan", "tanh", "task", "temperature", "time", "timer", "tran", "tranif0", "tranif1", "transition", "tri", "tri0", "tri1", "triand", "trior", "trireg", 
			"units", 
			"vectored", "vt", 
			"wait", "wand", "weak0", "weak1", "while", "white_noise", "wire", "wor", 
			"xnor", "xor", 
			"zi_nd", "zi_np", "zi_zd", "zi_zp"
	);

	@Override
	public void validate(String value) {
		if (keywords.contains(value.trim().toLowerCase())) {
			addMessage("Value must not be one of the reserved keywords");
		}
	}
}
