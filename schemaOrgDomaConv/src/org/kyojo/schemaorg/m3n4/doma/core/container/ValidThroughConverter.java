package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.VALID_THROUGH;
import org.kyojo.schemaorg.m3n4.core.Container.ValidThrough;

@ExternalDomain
public class ValidThroughConverter implements DomainConverter<ValidThrough, Date> {

	@Override
	public Date fromDomainToValue(ValidThrough domain) {
		return domain.getNativeValue();
	}

	@Override
	public ValidThrough fromValueToDomain(Date value) {
		return new VALID_THROUGH(value);
	}

}
