package serviciosCognitivos;

import java.io.FileOutputStream;

import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import logicaDeNegocios.dao.DaoEvaluacion;

public class GenerarPDF {
	String home = System.getProperty("user.home");
	
	public void generarPDF(String nombreEvaluacion, String CodigoCurso){
		DaoEvaluacion datosEvaluacion= new DaoEvaluacion();
		try{
			FileOutputStream archivo = new FileOutputStream(home+"/Downloads/Evaluacion.pdf");
			Document doc= new Document();
			PdfWriter.getInstance(doc, archivo);
			doc.open();
			doc.add(new Paragraph(datosEvaluacion.consultarInfoEvaluacion(nombreEvaluacion, CodigoCurso)));
			doc.close();
			
			JOptionPane.showMessageDialog(null, "Se ha generado el PDF con éxito");
		}catch(Exception e1){
			JOptionPane.showMessageDialog(null, "El PDF no ha sido generado");
		}
	}

}
