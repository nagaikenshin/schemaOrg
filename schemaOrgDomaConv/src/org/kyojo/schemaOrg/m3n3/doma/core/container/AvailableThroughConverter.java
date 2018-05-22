package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AVAILABLE_THROUGH;
import org.kyojo.schemaOrg.m3n3.core.Container.AvailableThrough;

@ExternalDomain
public class AvailableThroughConverter implements DomainConverter<AvailableThrough, Date> {

	@Override
	public Date fromDomainToValue(AvailableThrough domain) {
		return domain.getNativeValue();
	}

	@Override
	public AvailableThrough fromValueToDomain(Date value) {
		return new AVAILABLE_THROUGH(value);
	}

}
