package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.AVAILABLE_THROUGH;
import org.kyojo.schemaorg.m3n4.core.Container.AvailableThrough;

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
