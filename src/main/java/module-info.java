module opental.pdf {
	
	requires org.slf4j;
	requires org.hamcrest;
	requires junit;
	requires org.assertj.core;
	requires org.apache.commons.configuration2;
	requires org.apache.commons.codec;
	requires org.apache.commons.lang3;
	requires org.reflections;
	requires java.desktop;
	requires javafx.graphics;
	requires javafx.controls;
	
	requires org.apache.pdfbox;
	requires org.apache.pdfbox.tools;
	requires org.apache.pdfbox.debugger;
	requires preflight;

	requires opental.core;
	
	provides org.vebqa.vebtal.TestAdaptionPlugin with
		org.vebqa.vebtal.pdfrestserver.PdfTestAdaptionPlugin;
}