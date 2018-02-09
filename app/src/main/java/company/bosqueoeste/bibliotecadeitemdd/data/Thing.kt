package company.bosqueoeste.bibliotecadeitemdd.data

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

/**
 * Created by juancho on 30/01/18.
 */
@Entity
data class Thing(@Id var idObjeto : Long =0, var nombre: String, var descripcion : String, var rareness: Rareness)