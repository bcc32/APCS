import java.util.*;
import java.io.*;

public class CandidatePool
{
    /** The list of all Candidates */
    private List<Candidate> pool;

    /** Constructs a new CandidatePool object */
    public CandidatePool()
    {
        pool = new ArrayList<Candidate>();
    }

    /** Adds candidate to the pool
     *  @param candidate the candidate to add to the pool */
    public void addCandidate( Candidate candidate )
    {
        pool.add( candidate );
    }

    /** Returns a list of candidates from the pool that have the same position
     *  as position
     *  @param position the position of candidates to return
     *  @return a list of candidates that have the desired position */
    public List<Candidate> getCandidatesForPosition( String position )
    {
        List<Candidate> desired = new ArrayList<Candidate>;
        Iterator it = pool.iterator();
        while ( it.hasNext() )
        {
            Candidate candidate = it.next();
            if ( candidate.getPosition().equals( position ) )
                desired.add( candidate );
        }
        return desired;
    }

    /** Returns the candidate from the pool with the highest interview score
     *  that has the same position as position or null if position does not
     *  match the position of any candidate
     *  @param position the position of the candidate to return
     *  @return the candidate for position with the highest interview score
     *  or null */
    public Candidate getBestCandidate( String position )
    {
        List<Candidate> candidates = getCandidatesForPosition( position );
        if ( candidates.isEmpty() )
            return null;
        Iterator it = candidates.iterator();
        Candidate best = it.next();
        while ( it.hasNext() )
        {
           Candidate candidate = it.next();
           if ( candidate.getInterviewScore() > best.getInterviewScore() )
               best = candidate;
        }
        return candidate;
    }

    /** Removes all candidates from the pool that have the same position as
     *  position
     *  @param position the position of the candidate to remove from the pool
     *  @return the number of candidates removed from the pool */
    public int removeCandidatesForPosition( String position )
    {
        int c = 0;
        List<Candidate> candidate = getCandidatesForPosition( position );
        Iterator it = candidates.iterator();
        while ( it.hasNext() )
        {
            pool.remove( candidate );
            c++;
        }
        return c;
    }
}
