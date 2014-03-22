package net.anotheria.moskito.webui.producers.api;

import net.anotheria.anoplass.api.API;
import net.anotheria.anoplass.api.APIException;
import net.anotheria.anoprise.metafactory.Service;
import net.anotheria.moskito.core.registry.IProducerFilter;
import org.distributeme.annotation.DistributeMe;
import org.distributeme.annotation.SupportService;

import java.util.List;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 14.02.13 11:49
 */
@DistributeMe(agentsSupport=false)
@SupportService
public interface ProducerAPI extends API, Service {
	List<UnitCountAO> getCategories() throws APIException;

	List<UnitCountAO> getSubsystems() throws APIException;

	List<ProducerAO> getAllProducers();

	List<ProducerAO> getAllProducersByCategory(String currentCategory);

	List<ProducerAO> getProducers(IProducerFilter[] iProducerFilters);

	List<ProducerAO> getAllProducersBySubsystem(String currentSubsystem);

	ProducerAO getProducer(String producerId) throws APIException;
}
