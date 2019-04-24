package Converter;

import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import ManagedBean.ComboMb;
import ManagedBean.SousCategorieMb;
import delta.entity.entities.CategorieFournitureEntity;

@FacesConverter(value = "catConverter")
public class CatConverter implements Converter {
	

	    @Override
	    public Object getAsObject(FacesContext context, UIComponent component, String value) {
	        return CategorieFournitureEntity.getNom(value);  
	    }
	 
	    @Override
	    public String getAsString(FacesContext context, UIComponent component, Object value) {
	        if (value == null || value.equals("")) {  
	            return "";  
	        } else {  
	            return String.valueOf(((CategorieFournitureEntity) value).getId().toString());  
	        }  
	    }
	
	

	


}
