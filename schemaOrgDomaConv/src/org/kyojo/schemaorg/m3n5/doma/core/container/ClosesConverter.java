package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.sql.Time;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CLOSES;
import org.kyojo.schemaorg.m3n5.core.Container.Closes;

@ExternalDomain
public class ClosesConverter implements DomainConverter<Closes, Time> {

	@Override
	public Time fromDomainToValue(Closes domain) {
		if(domain != null && domain.getTimeList() != null && domain.getTimeList().size() > 0) {
			return Time.valueOf(domain.getTimeList().get(0).getTime());
		} else {
			return null;
		}
	}

	@Override
	public Closes fromValueToDomain(Time value) {
		return new CLOSES(value);
	}

}
