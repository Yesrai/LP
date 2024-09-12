package pe.edu.upeu.examen.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import pe.edu.upeu.examen.entity.Proveedor;
import pe.edu.upeu.examen.service.ProveedorService;

	@RestController
	@RequestMapping("/api/almacenes")
	public class ProveedorController {
		@Autowired
		private ProveedorService proveedorService;
		
		@GetMapping
		public ResponseEntity<List<Proveedor>> readAll(){
			try {
				List<Proveedor> Proveedores = proveedorService.readAll();
				if(Proveedores.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<>(Proveedores, HttpStatus.OK);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
		@PostMapping
		public ResponseEntity<Proveedor> crear(@Valid @RequestBody Proveedor cat){
			try {
				Proveedor c = proveedorService.create(cat);
				return new ResponseEntity<>(c, HttpStatus.CREATED);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
		@GetMapping("/{id}")
		public ResponseEntity<Proveedor> getAutorId(@PathVariable("id") Long id){
			try {
				Proveedor c = proveedorService.read(id).get();
				return new ResponseEntity<>(c, HttpStatus.CREATED);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
		@DeleteMapping("/{id}")
		public ResponseEntity<Proveedor> delAutor(@PathVariable("id") Long id){
			try {
				proveedorService.delete(id);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
		@PutMapping("/{id}")
		public ResponseEntity<?> updateAutor(@PathVariable("id") Long id, @Valid @RequestBody Proveedor cat){

				Optional<Proveedor> c = proveedorService.read(id);
				if(c.isEmpty()) {
					return new ResponseEntity<>(proveedorService.update(cat), HttpStatus.OK);
				}else {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}		
			
		}
	}
