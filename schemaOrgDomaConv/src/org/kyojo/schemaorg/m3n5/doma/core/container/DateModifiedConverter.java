package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DATE_MODIFIED;
import org.kyojo.schemaorg.m3n5.core.Container.DateModified;

@ExternalDomain
public class DateModifiedConverter implements DomainConverter<DateModified, Date> {

	@Override
	public Date fromDomainToValue(DateModified domain) {
		return domain.getNativeValue();
	}

	@Override
	public DateModified fromValueToDomain(Date value) {
		return new DATE_MODIFIED(value);
	}

}
