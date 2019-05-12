package org.kyojo.schemaorg.m3n5.doma.auto.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.auto.impl.MODEL_DATE;
import org.kyojo.schemaorg.m3n5.auto.Container.ModelDate;

@ExternalDomain
public class ModelDateConverter implements DomainConverter<ModelDate, Date> {

	@Override
	public Date fromDomainToValue(ModelDate domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public ModelDate fromValueToDomain(Date value) {
		return new MODEL_DATE(value);
	}

}