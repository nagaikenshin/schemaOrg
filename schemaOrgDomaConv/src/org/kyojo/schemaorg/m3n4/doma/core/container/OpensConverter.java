package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.sql.Time;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.OPENS;
import org.kyojo.schemaorg.m3n4.core.Container.Opens;

@ExternalDomain
public class OpensConverter implements DomainConverter<Opens, Time> {

	@Override
	public Time fromDomainToValue(Opens domain) {
		if(domain != null && domain.getTimeList() != null && domain.getTimeList().size() > 0) {
			return Time.valueOf(domain.getTimeList().get(0).getTime());
		} else {
			return null;
		}
	}

	@Override
	public Opens fromValueToDomain(Time value) {
		return new OPENS(value);
	}

}