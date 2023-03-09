module datosi.calculadorapersonas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens datosi.calculadorapersonas to javafx.fxml;
    exports datosi.calculadorapersonas;
}