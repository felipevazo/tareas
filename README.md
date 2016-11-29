
function Producto () {
  this.codigo=123;
  this.nombre="NombreProducto";
}
function Desarrolador()
{ this.Nombre="Feilpe";
}




function Software()
{
}
Software.prototype=new Producto();
Software.prototype.licencia="NombreLicencia";
Software.prototype.version="Version";
Software.prototype.setLicencia=function(String

