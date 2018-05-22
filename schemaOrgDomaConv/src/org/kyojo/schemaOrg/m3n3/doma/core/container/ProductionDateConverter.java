package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PRODUCTION_DATE;
import org.kyojo.schemaOrg.m3n3.core.Container.ProductionDate;

@ExternalDomain
public class ProductionDateConverter implements DomainConverter<ProductionDate, Date> {

	@Override
	public Date fromDomainToValue(ProductionDate domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public ProductionDate fromValueToDomain(Date value) {
		return new PRODUCTION_DATE(value);
	}

}
